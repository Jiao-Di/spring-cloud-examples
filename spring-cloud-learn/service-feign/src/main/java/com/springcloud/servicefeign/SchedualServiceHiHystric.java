package com.springcloud.servicefeign;

import org.springframework.stereotype.Component;

/**
 * @author jiaod
 * @date 2020/7/24
 * @description:
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
