package com.vveginati.microservices.limitsservice.controller;

import com.vveginati.microservices.limitsservice.bean.Limits;
import com.vveginati.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

        @Autowired
        private Configuration configuration;

        @GetMapping("/limits")
        public Limits getLimits(){
            return new Limits(configuration.getMin(), configuration.getMax());
        }

}
