package ejercicios;

import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ej12_RequestMapping {
@RequestMapping(path = "/get", method = RequestMethod.GET)
	public static String getPersona(Persona persona) {
		
		return "Nombre: " + persona.nombre + " "+ persona.apellidos + "\n" + "Edad: " + persona.edad;

	}
@RequestMapping(path = "/post", method = RequestMethod.POST)
public static String postPersona(Persona persona) {
	
	return "El objeto se ha introducido correctamente." + "\nNombre: " + persona.nombre + "\nApellidos: " + persona.apellidos + "\nEdad: " + persona.edad;

}
@RequestMapping(path = {"/delete","delete/{id}"}, method = RequestMethod.DELETE)
 static String deletePersona(@PathVariable(name = "id")Optional<Integer> id) {
	if(id.isEmpty()) {
		return "Introduce un ID para eliminar";
	}
	
	return "El objeto se ha eliminado correctamente";

}
@RequestMapping(path = "/put", method = RequestMethod.PUT)
public static String putPersona(Persona persona) {
	
	return "El objeto se ha introducido correctamente." + "\nNombre: " + persona.nombre + "\nApellidos: " + persona.apellidos + "\nEdad: " + persona.edad;

}
	public static class Persona{
		private String nombre,apellidos,edad;
		
		public Persona(String nombre, String apellidos, String edad) {
			super();
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.edad = edad;
		}
		
		public Persona() {}
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellidos() {
			return apellidos;
		}
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		public String getEdad() {
			return edad;
		}
		public void setEdad(String edad) {
			this.edad = edad;
		}
		
	}
}
