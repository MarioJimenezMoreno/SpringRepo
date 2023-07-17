package ejercicios;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class Ej04_StatusCode {
	@ResponseBody
	@ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
	@RequestMapping("/sc")
	public static String main() {
		return "¡Soy una tetera!";	
	}
}
