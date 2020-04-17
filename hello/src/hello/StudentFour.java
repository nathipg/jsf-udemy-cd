package hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentFour {

	private String firstName;
	private String lastName;
	private String[] favoriteLanguages;
	
	// Programming Languages
	List<String> programmingLanguageOptions;
	
	// no-args constructor
	public StudentFour() {
		programmingLanguageOptions = new ArrayList<>();
		
		programmingLanguageOptions.add("Java");
		programmingLanguageOptions.add("C#");
		programmingLanguageOptions.add("PHP");
		programmingLanguageOptions.add("Ruby");
	}

	// getters/setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String[] getFavoriteLanguages() {
		return favoriteLanguages;
	}

	public void setFavoriteLanguages(String[] favoriteLanguages) {
		this.favoriteLanguages = favoriteLanguages;
	}

	public List<String> getProgrammingLanguageOptions() {
		return programmingLanguageOptions;
	}

	public void setProgrammingLanguageOptions(List<String> programmingLanguageOptions) {
		this.programmingLanguageOptions = programmingLanguageOptions;
	}	
	
}
