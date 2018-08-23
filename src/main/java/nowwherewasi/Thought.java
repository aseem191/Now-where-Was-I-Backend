package nowwherewasi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Thought {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String thought;
	
	private String place;
	
	private int time;
	
	public String getThought() {
		return this.thought;
	}
	
	public void setThought(String thought) {
		this.thought = thought;
	}
	
	public String getPlace() {
		return this.place;
	}
	
	public void setPlace(String place) {
		this.place = place;
	}
	
	public int getTime() {
		return this.time;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
}
