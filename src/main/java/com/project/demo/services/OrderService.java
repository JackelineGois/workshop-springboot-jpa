package com.project.demo.services;

import com.project.demo.entities.Order;
import com.project.demo.repositories.OrderRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

  @Autowired
  private OrderRepository repository;

  public List<Order> findAll() {
    try {
      return repository.findAll();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return null;
  }

  public Order findById(Long id) {
    Optional<Order> obj = repository.findById(id);
    return obj.get();
  }
}
