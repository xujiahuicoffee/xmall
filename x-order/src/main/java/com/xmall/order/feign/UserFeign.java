package com.xmall.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xujiahui
 * @ClassName UserFeign
 * @description: TODO
 * @time 2023/8/4 15:36
 */
@FeignClient(value = "x-user")
public interface UserFeign {

    @PostMapping("/user/queryById")
    String queryById(@RequestParam("userId") Long userId);

}
