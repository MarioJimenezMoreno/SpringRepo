package ejercicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ej02c_Controller {

	@ResponseBody
	@RequestMapping("/index")
	public static String mainIndex() {
		return "index.html";	
	}
	
	@ResponseBody
	@RequestMapping("/menu")
	public static String mainMenu() {
		return "menu.html";	
	}
	
	@ResponseBody
	@RequestMapping("/profile")
	public static String mainProfile() {
		return "profile.html";	
	}

}
