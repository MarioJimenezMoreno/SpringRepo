package ejercicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Controller
public class Ej07b_RequestParam {
	@ResponseBody
		@GetMapping("/paramjson")
		public static TextToJSON main(@RequestParam(required = false, defaultValue = "desconocido") String name,@RequestParam(required = false, defaultValue = "desconocido") String surname) {
			
				return new TextToJSON(name,surname);
	
		}
	@Getter
	@Setter
	@AllArgsConstructor
	//@Data - engloba todo
		public static class TextToJSON{
			String name = "";
			String surname = "";					
		}

}
