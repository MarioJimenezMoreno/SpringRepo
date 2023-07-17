package ejercicios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/{num}")
public class Ej11_PathVariable {
@GetMapping("/factura")
	public static String main(@PathVariable(name = "num")int num) {
		
	if(num % 2 == 0){
		return "Es Par";
	}	
		
		return "Es Impar";

	}

}
