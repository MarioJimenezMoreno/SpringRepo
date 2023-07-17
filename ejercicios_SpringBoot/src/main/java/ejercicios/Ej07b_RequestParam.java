package ejercicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ej07b_RequestParam {
	@ResponseBody
		@GetMapping("/paramjson")
		public static TextToJSON main(@RequestParam(required = false, defaultValue = "desconocido") String name,@RequestParam(required = false, defaultValue = "desconocido") String surname) {
			
				return new TextToJSON(name,surname);
	
		}
		
		public static class TextToJSON{
			String name = "";
			String surname = "";
						
			public TextToJSON(String name, String surname) {
				super();
				this.name = name;
				this.surname = surname;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getSurname() {
				return surname;
			}
			public void setSurname(String surname) {
				this.surname = surname;
			}
			
			
			
		}

}
