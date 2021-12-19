package com.ciclo4.ciclo4_reto2.repository.crud;

import com.ciclo4.ciclo4_reto2.model.Order;
import java.util.List;
import java.util.Date;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface OrderCrudRepository extends MongoRepository<Order, Integer>{
    List<Order> findBySalesManZone(String zone);
      List<Order> findBySalesManId(Integer id);
    List<Order> findBySalesManIdAndStatus(Integer id, String status);
    List<Order> findByRegisterDayAndSalesManId(Date registerDay, Integer id);
}