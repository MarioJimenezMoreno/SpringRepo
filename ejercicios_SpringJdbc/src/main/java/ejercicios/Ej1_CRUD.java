package ejercicios;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ej1_CRUD {
@Autowired
private  JdbcTemplate jdbcTemplate;

@GetMapping("/select")
	public List<Map<String,Object>> getAllUsers() {
	String QUERY = "SELECT * FROM USERS";
	
	List<Map<String,Object>> result = jdbcTemplate.queryForList(QUERY);
	
		return result;
	
	}

@GetMapping("/select/{id}")
public Object getUser(@PathVariable(name = "id")int id) {

	String QUERY = "SELECT * FROM USERS WHERE id = " + id;

	List<Map<String,Object>> result = jdbcTemplate.queryForList(QUERY);

	if(result.isEmpty()) {
		textResponse errorId = new textResponse("Inserted id does not exist");
		
		return errorId;
	}
	return result;

}

@GetMapping("/create")
public Object createUser(@RequestParam(name = "nombre",required = false) String nombre,
        @RequestParam(name = "apellidos",required = false) String apellidos,
        @RequestParam(name = "fecha",required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fecha)
{
	
	String QUERY = "INSERT INTO users(nombre, apellidos, fechaNacimiento) values (?, ?, ?)";

	if (nombre.isEmpty() || apellidos.isEmpty() || fecha == null) {
		textResponse missingParameters = new textResponse("Falta algún parámetro");
        return missingParameters;
    }

    try {
        jdbcTemplate.update(QUERY, nombre, apellidos, fecha);

        textResponse createdSuccessfully = new textResponse("Se ha creado de forma exitosa");
        return createdSuccessfully;
    } catch (Exception e) {
    	textResponse errorResponse = new textResponse("Error occurred while creating user");
        return errorResponse;
    }
}


public class textResponse {
    private String Response;

    // Constructor
    public textResponse(String Response) {
        this.Response = Response;
    }

    // Getters and setters
    public String getResponse() {
        return Response;
    }

    public void setResponse(String Response) {
        this.Response = Response;
    }
}


}
