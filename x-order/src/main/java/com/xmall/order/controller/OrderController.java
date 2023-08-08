package com.xmall.order.controller;

import com.xmall.order.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xujiahui
 * @ClassName OrderController
 * @description: TODO
 * @time 2023/8/4 15:34
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private UserFeign userFeign;

    @PostMapping(value = "/queryById")
    public String queryById(@RequestParam Long orderId) {
        return "订单编号：" + userFeign.queryById(orderId) + "，购买商品：" + "小米台灯";
    }


}
