package com.atguigu.springcloud.service;


import com.atguigu.springcloud.entity.Payment;
import org.springframework.stereotype.Service;

/**
 * @author shkstart
 * @create 2020-11-03 12:02
 */

public interface PaymentService {
    public int create(Payment payment); //写
    public Payment getPaymentById(Long id);  //读取
}
