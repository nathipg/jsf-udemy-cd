package hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentFive {

	private String firstName;
	private String lastName;
	private String favoriteLanguage;
	
	// Programming Languages
	List<String> programmingLanguageOptions;
	
	// no-args constructor
	public StudentFive() {
		programmingLanguageOptions = new ArrayList<>();
		
		programmingLanguageOptions.add("Java");
		programmingLanguageOptions.add("C#");
		programmingLanguageOptions.add("PHP");
		programmingLanguageOptions.add("Ruby");
		
		// pre-populate the bean
		firstName = "Apollo";
		lastName = "Pissuti";
		favoriteLanguage = "Ruby";
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

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public List<String> getProgrammingLanguageOptions() {
		return programmingLanguageOptions;
	}

	public void setProgrammingLanguageOptions(List<String> programmingLanguageOptions) {
		this.programmingLanguageOptions = programmingLanguageOptions;
	}	
	
}
