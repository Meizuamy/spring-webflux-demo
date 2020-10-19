package cn.utry.utmp.controller;

import com.alibaba.druid.stat.DruidStatManagerFacade;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class DruidStatController {
    
    @GetMapping("/druid/stat")
    public Mono<Object> druidStat(){
       return Mono.just(DruidStatManagerFacade.getInstance().getDataSourceStatDataList());
    }
}
