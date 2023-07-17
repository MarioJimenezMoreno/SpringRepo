package ejercicios;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ej02b_Controller {
	@RequestMapping(path = "/rc")
	public static String RestController() {
		return "Hola";	
	}
}
