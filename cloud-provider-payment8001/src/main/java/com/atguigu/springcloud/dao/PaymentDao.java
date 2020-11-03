package com.atguigu.springcloud.dao;


import com.atguigu.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @create 2020-11-03 11:53
 */
@Component
public interface PaymentDao {
   int create(Payment payment);
   Payment  getPaymentById(@Param("id") Long id);
}
