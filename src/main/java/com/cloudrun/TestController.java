/**
 * 
 */
package com.cloudrun;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vibhor.bhatnagar
 *
 */
@RestController
public class TestController {

	@GetMapping("/hello")
	public String getHello() {
		return "Hello, I am Cloud run job...!";
	}

}
