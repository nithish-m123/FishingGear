package com.chimtu.SpringSec.service;

import com.chimtu.SpringSec.model.*;
import com.chimtu.SpringSec.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OrderItemService {
    @Autowired
    private OrderItemRepository orderItemRepository;

    public List<OrderItem> getAllOrderItems() {
        return orderItemRepository.findAll();
    }

    public Optional<OrderItem> getOrderItemById(Long id) {
        return orderItemRepository.findById(id);
    }

    public OrderItem createOrderItem(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    public OrderItem updateOrderItem(Long id, OrderItem orderItemDetails) {
        OrderItem orderItem = orderItemRepository.findById(id).orElseThrow(() -> new RuntimeException("OrderItem not found"));
        orderItem.setOrder(orderItemDetails.getOrder());
        orderItem.setProduct(orderItemDetails.getProduct());
        orderItem.setQuantity(orderItemDetails.getQuantity());
        return orderItemRepository.save(orderItem);
    }

    public void deleteOrderItem(Long id) {
        orderItemRepository.deleteById(id);
    }
}