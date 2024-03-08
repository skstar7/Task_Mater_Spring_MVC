package dto;

import java.time.LocalDate;
import lombok.Data;

@Data
public class User {

	private int id;

	private String name;

	private long mobile;

	private String password;

	private String gender;

	private LocalDate dob;

}
