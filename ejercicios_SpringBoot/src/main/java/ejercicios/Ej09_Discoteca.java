package ejercicios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ej09_Discoteca {
@GetMapping("/discoteca")
	public static String main(@RequestParam(required = false) Integer edad) {
		if(edad == null) {
			return "DNI, por favor.";
		}
		else if(edad >= 18){
			return "Puedes pasar";
		}
		else {
			return "No puedes pasar!";
		}
	}
}
