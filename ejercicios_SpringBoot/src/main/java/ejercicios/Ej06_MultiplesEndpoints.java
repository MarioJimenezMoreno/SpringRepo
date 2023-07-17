package ejercicios;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludos")
public class Ej06_MultiplesEndpoints {
	@RequestMapping(value={"/hola","/hello","/salut"})
	public static String main() {
		return "Hola, hello, salut";
	}

}
