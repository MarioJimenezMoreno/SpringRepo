package ejercicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ej03a_JSON {
	@ResponseBody
	@RequestMapping("/ttj")
	public static TextToJSON main() {
		
		return new TextToJSON("Mensaje TTJ");

	}
	
	public static class TextToJSON{
		String message = "";
		
		public TextToJSON(String message) {
			super();
			this.message = message;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
		
	}

}
