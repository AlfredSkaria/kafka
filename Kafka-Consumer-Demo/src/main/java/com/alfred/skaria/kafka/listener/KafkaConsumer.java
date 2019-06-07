package com.alfred.skaria.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.alfred.skaria.kafka.model.User;

@Service
public class KafkaConsumer {

	@KafkaListener(topics="kafkaPOC" , groupId = "group_id")
	public void consume(String message) {
		System.out.println("Cosumed msg: "+message);
	}
	
	@KafkaListener(topics="kafkaPOCJSON", groupId = "group_id_json", containerFactory = "jsonKafkaListenerContainerFactory")
	public void consumeJson(User user) {
		System.out.println("consumed json: "+ user);
	}
}
