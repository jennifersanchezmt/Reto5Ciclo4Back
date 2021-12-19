package com.ciclo4.ciclo4_reto2.repository;
/**
 * Importaciones
 */
import com.ciclo4.ciclo4_reto2.model.User;
import com.ciclo4.ciclo4_reto2.repository.crud.UserCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/**
 * Repository
 * @author Jennifer
 */
@Repository
/**
 * Clase UserRepository
 */
public class UserRepository {
/**
 * Autowired
 */
    @Autowired
    private UserCrudRepository userCrudRepository;
/**
 * User Get All
 * @return 
 */
    public List<User> getAll() {
        return (List<User>) userCrudRepository.findAll();
    }
/**
 * User get
 * @param id
 * @return 
 */
    public Optional<User> getUser(int id) {
        return userCrudRepository.findById(id);
    }
/**
 * User Create
 * @param user
 * @return 
 */
    public User create(User user) {
        return userCrudRepository.save(user);
    }
/**
 * User Update
 * @param user 
 */
    public void update(User user) {
        userCrudRepository.save(user);
    }
/**
 * User Delete
 * @param user 
 */
    public void delete(User user) {
        userCrudRepository.delete(user);
    }
/**
 * Email Exists
 * @param email
 * @return 
 */
    public boolean emailExists(String email) {
        Optional<User> user = userCrudRepository.findByEmail(email);
        return user.isPresent();
    }
/**
 * Authenticate User
 * @param email
 * @param password
 * @return 
 */
    public Optional<User> authenticateUser(String email, String password) {
        return userCrudRepository.findByEmailAndPassword(email, password);
    }
/**
 * User get MonthBirthday
 * @param month
 * @return 
 */
    public List<User> getByMonthBirthDay(String month) {
        return userCrudRepository.findByMonthBirthtDay(month);
    }
}
