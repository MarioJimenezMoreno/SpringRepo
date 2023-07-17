package ejercicios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Ej07a_RequestParam {
	@GetMapping("/param")
	public static String main(@RequestParam(required = false) String name,@RequestParam(required = false) String surname) {
		
		if(name == null && surname == null) {
			return "Welcome";
		}
		else if(name != null && surname == null) {
			return "Welcome "+name;
		}
		else if(name == null && surname != null){
			return "Welcome "+surname;
		}
		else {
			return "Welcome "+name+" "+surname;
		}
	}
}
