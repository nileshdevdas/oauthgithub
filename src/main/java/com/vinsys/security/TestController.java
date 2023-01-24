package com.vinsys.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/secured")
public class TestController {

	@GetMapping
	public String app() {

		return "Oauth Secured";
	}

}
