package co.edureka.services;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import co.edureka.models.Student;

@Path("/edureka")
public class StudentRegistrationController {
	@POST
	@Path("/student/register")
	@Produces("application/json")
	public Student registerStudent(@FormParam("name_field") String studName, @FormParam("age_field") Integer studAge, @FormParam("addr_field") String address) {
		Student stud = new Student();
		stud.setStudentName(studName);
		stud.setStudentAge(studAge);
		stud.setStudentAddress(address);
		
		return stud;
	}
}
