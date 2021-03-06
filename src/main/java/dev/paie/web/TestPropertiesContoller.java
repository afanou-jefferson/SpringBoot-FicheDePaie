package dev.paie.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestPropertiesContoller {

	@Value("${message.default.welcome}")
	private String welcomeMessage;

	@Value("${message.default.goodbye}")
	private String goodBye;

	@RequestMapping("/welcome")
	public String welcome() {
		return welcomeMessage;
	}

	@RequestMapping("/bye")
	public String bye() {
		return goodBye;
	}
}