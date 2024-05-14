package com.example.cart.api;

import com.example.cart.domain.dto.response.TokenInfoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("AUTH-SERVICE")
public interface FeignAuth {
    @GetMapping("api/v1/auth/parse")
    TokenInfoResponse parseToken(@RequestParam("token") String token);
}
