package ejercicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Controller
public class Ej03e_JSON {
	@ResponseBody
	@RequestMapping("/random")
	public static ResponseEntity<String> main() {

		int num = (int) (Math.random()*2);

		switch (num) {
		case 0:
			return new ResponseEntity<String>("{\"message\": \"OK\"}"
					, null, HttpStatus.OK);
		case 1:
			return new ResponseEntity<String>("{\"message\": \"NOT_FOUND\"}"
					, null, HttpStatus.NOT_FOUND);
			
		}
		return new ResponseEntity<String>("{\"message\": \"ALGO SALIÓ MAL\"}"
				, null, HttpStatus.I_AM_A_TEAPOT);
	}
}

