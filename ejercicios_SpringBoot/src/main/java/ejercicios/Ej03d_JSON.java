package ejercicios;

import org.springframework.http.MediaType;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ej03d_JSON {
	@ResponseBody
	@RequestMapping("/entity")
	public static ResponseEntity<String> main() {
		final HttpHeaders hh = new HttpHeaders();
		hh.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>("{\"message\": \"Mensaje Response Entity\"}"
				, hh, HttpStatus.OK);

	}
}
