package com.microapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microapp.beans.ExchangeValue;
import com.microapp.repository.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private Environment environment;

	@Autowired
	private ExchangeValueRepository repository;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {

		ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
		//ExchangeValue exchange = new ExchangeValue(1000L, from, to, BigDecimal.valueOf(100));
		exchangeValue.setPort(Integer.valueOf(environment.getProperty("local.server.port")));

		return exchangeValue;
	}
}
