package ejercicios;

import java.util.Map;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController
public class Ej08_RequestParamInfinitos {
	
	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(Ej08_RequestParamInfinitos.class);
	
	@GetMapping("/paraminfinity")
	public static String main(@RequestParam(required = false, defaultValue = "La zona de parámetro está vacía ¡No has enviado nada!")Map<String,String> allParams) {
		
		if(allParams.isEmpty()) {
			return "Los parámetros son: " + "La zona de parámetro está vacía ¡No has enviado nada!";
		}
		else {
			for (Map.Entry<String, String> entry : allParams.entrySet()) {
				LOGGER.info(entry.getKey()+": "+entry.getValue());
			}
			return "Los parámetros son: " + allParams.entrySet();
		}
	}
}
