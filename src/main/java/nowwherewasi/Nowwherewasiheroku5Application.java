package nowwherewasi;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class Nowwherewasiheroku5Application {
	
	@Autowired
	 private DataSource dataSource;

	@RequestMapping("/dbadd")
	  String db(Map<String, Object> model) {
	    try (Connection connection = dataSource.getConnection()) {
	      Statement stmt = connection.createStatement();
	      stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Thought (id bigserial primary key, thought TEXT, place TEXT, time INTEGER);");
	      //stmt.executeUpdate("INSERT INTO Thought (thought, place, time) VALUES ('Make food.', 'kitchen', 1);");
	      return "db";
	    } catch (Exception e) {
	      model.put("message", e.getMessage());
	      return "err";
	    }
	  }

	public static void main(String[] args) {
		SpringApplication.run(Nowwherewasiheroku5Application.class, args);
	}
}
