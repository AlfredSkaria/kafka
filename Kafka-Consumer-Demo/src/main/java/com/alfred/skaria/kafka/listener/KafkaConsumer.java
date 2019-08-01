package com.alfred.skaria.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.alfred.skaria.kafka.model.Vehicle;

@Service
public class KafkaConsumer {

	@KafkaListener(topics="kafkaPOC" , groupId = "group_id")
	public void consume(String message) {
		System.out.println("Cosumed msg: "+message);
	}
	
	@KafkaListener(topics="kafkaPOCJSON", groupId = "test-consumer-group", containerFactory="jsonKafkaListenerContainerFactory")
	public void consumeJson(Vehicle user) {
		System.out.println("consumed json: "+user.toString());
	}
}
