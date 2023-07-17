package ejercicios;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/apiVersion")
public class Ej05_ResponseStatus {
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping("/hacerCafe")
	public static void hacerCafe() {
		// TODO Auto-generated method stub

	}
	@ResponseBody
	@ResponseStatus(value = HttpStatus.I_AM_A_TEAPOT, reason = "Soy una tetera")
	@RequestMapping("/hacerTe")
	public static void hacerTe() {
		// TODO Auto-generated method stub

	}
	@ResponseBody
	@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Not Found")
	@RequestMapping("/notFound")
	public static void notFound() {
		// TODO Auto-generated method stub

	}
}
