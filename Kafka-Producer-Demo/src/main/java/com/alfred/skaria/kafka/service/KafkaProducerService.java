package com.alfred.skaria.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.alfred.skaria.kafka.model.User;

@Service
public class KafkaProducerService {
	
	@Autowired
	KafkaTemplate<String, User> kafkaJSONTemplate;
	
	private static final String JSONTOPIC = "kafkaPOCJSON";
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	private static final String TOPIC = "kafkaPOC";

	public void sendStringMessage(String name) {
		kafkaTemplate.send(TOPIC, name);
	}

	public void sendJsonObject(User user) {
		kafkaJSONTemplate.send(JSONTOPIC, user);	
	}

}
