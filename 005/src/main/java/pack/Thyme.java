package pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Thyme {
@RequestMapping("/hi")
	
public String welcome() {
	return "index";
}
}
