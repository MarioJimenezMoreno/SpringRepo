package ejercicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ej02a_Controller {
	@ResponseBody
	@RequestMapping("/c")
	public static String Controller() {
		return "Hola";	
	}
}
