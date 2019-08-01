package com.alfred.skaria.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.alfred.skaria.kafka.model.Vehicle;

@Service
public class KafkaProducerService {
	
	@Autowired
	KafkaTemplate<String, Vehicle> kafkaJSONTemplate;
	
	private static final String JSONTOPIC = "kafkaPOCJSON";
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	private static final String TOPIC = "kafkaPOC";

	public void sendStringMessage(String name) {
		kafkaTemplate.send(TOPIC, name);
	}

	public void sendJsonObject(Vehicle vehicle) {
		kafkaJSONTemplate.send(JSONTOPIC, vehicle);	
	}

}
