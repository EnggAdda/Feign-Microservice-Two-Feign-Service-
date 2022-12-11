package com.example.feignservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feignService")
public class FeignController {

    @Autowired
    private FeignUtil feignUtil;

    @GetMapping("/f-name")
    public String getName(){
return feignUtil.getName();

    }

    @GetMapping("/f-address")
    public String getAddress(){

      return  feignUtil.getAddress();
    }

    @GetMapping("/f-status")
    public String getStatus(){

       return feignUtil.getStatus();
    }
}
