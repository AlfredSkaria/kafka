package com.alfred.skaria.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alfred.skaria.kafka.model.User;

@RestController
@RequestMapping("/kafka")
public class KafkaProducer {
	
	@Autowired
	KafkaTemplate<String, User> kafkaJSONTemplate;
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	private static final String JSONTOPIC = "kafkaPOCJSON";
	private static final String TOPIC = "kafkaPOC";

	@PostMapping("/publish/json")
	public String publishJSONMessage(@RequestBody User user) {
		kafkaJSONTemplate.send(JSONTOPIC, user);
		return "published successfully"; 
	}
	
	@PostMapping("/publish/{name}")
	public String publishMessage(@PathVariable(name="name") String name) {
		kafkaTemplate.send(TOPIC, name);
		return "published successfully"; 
	}
}
