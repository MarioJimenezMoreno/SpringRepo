package ejercicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ej03b_JSON {
	@ResponseBody
	@RequestMapping(path = "/app", produces ="application/json")
	public static String main() {
		
		return "{\"message\": \"Mensaje Application\"}";

	}
	
}
