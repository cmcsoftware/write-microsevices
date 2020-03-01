package com.microservice.write.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.write.test.queue.QueueProducer;

@RestController
public class WriteController {

	@Autowired
	QueueProducer queueProducer;

	@GetMapping("/write")
	public ResponseEntity<Users> clear(@RequestParam("name") String name, @RequestParam("surname") String surname) {
		try {
			Users user = new Users();
			user.setName(name);
			user.setSurname(surname);
			queueProducer.produce(user);
			return new ResponseEntity<>(user, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
