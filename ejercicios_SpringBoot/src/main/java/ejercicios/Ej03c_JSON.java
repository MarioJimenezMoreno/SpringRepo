package ejercicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@Controller
public class Ej03c_JSON {
	@ResponseBody
	@RequestMapping("/obj")
	public static ObjectNode main() {
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode objectNode = mapper.createObjectNode();
		objectNode.put("message", "Mensaje ObjectNode");
		objectNode.put("Tu madre tiene una","polla que ya la qusiera yo");
		objectNode.put("me dio pena por tu padre", "el día en que se enteró");
		return objectNode;

	}

}
