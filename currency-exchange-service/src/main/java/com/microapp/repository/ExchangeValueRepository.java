package com.microapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microapp.beans.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	ExchangeValue findByFromAndTo(String from, String to);
}
