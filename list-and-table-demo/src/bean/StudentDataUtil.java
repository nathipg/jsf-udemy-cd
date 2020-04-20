package bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class StudentDataUtil {

	private List<Student> students;
	
	public StudentDataUtil() {
		loadSampleData();
	}
	
	public void loadSampleData() {
		students = new ArrayList<>();
		
		students.add(new Student("Aluno 1", "Sobrenome Aluno 1", "aluno1@email.com"));
		students.add(new Student("Aluno 2", "Sobrenome Aluno 2", "aluno2@email.com"));
		students.add(new Student("Aluno 3", "Sobrenome Aluno 3", "aluno3@email.com"));
	}

	public List<Student> getStudents() {
		return students;
	}
	
}
