package com.alfred.skaria.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alfred.skaria.kafka.model.User;
import com.alfred.skaria.kafka.service.KafkaProducerService;

@RestController
@RequestMapping("/kafka")
public class KafkaProducerController {

	@Autowired
	KafkaProducerService kafkaProducerService;

	@PostMapping("/publish/json")
	public ResponseEntity<String> publishJSONMessage(@RequestBody User user) {
		kafkaProducerService.sendJsonObject(user);
		return new ResponseEntity<String>("Json Published Successfully", HttpStatus.OK);
	}

	@PostMapping("/publish/{name}")
	public ResponseEntity<String> publishMessage(@PathVariable(name = "name") String name) {
		kafkaProducerService.sendStringMessage(name);
		return new ResponseEntity<String>("Published Successfully", HttpStatus.OK);
	}
}
