package ejercicios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ej10_CaraOCruz {
@GetMapping("/caracruz")
	public static String main(@RequestParam(required = false) String apuesta) {
		
			if(apuesta == null) {
				return "Introduce una apuesta";
			}
			else {
				int num = (int) (Math.random()*2);
				System.out.println(num);
				String resultado = (num == 0)?"cara":"cruz";
				return (apuesta.contains(resultado))?"Has ganado":"Has perdido";
			}

	}

}
