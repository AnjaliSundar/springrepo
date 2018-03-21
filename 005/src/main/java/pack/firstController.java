package pack;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class firstController {
	@RequestMapping
	public String sayhello() {
		return "Hello from Spring Boot";
	}

}
