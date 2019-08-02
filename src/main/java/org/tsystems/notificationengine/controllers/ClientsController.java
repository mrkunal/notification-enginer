package org.tsystems.notificationengine.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tsystems.notificationengine.utils.co.ClientsCo;

@RestController
public class ClientsController {

	
	
	@PostMapping
	ResponseEntity<String> update(ClientsCo clientsCo)
	{
	
		return null;
	}
	
}
