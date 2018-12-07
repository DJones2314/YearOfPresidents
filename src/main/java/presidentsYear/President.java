package presidentsYear;

import java.util.List;

public class President {
	// Attr
	private String name;
	private String birthDate;
	private String birthPlace;
	private String deathDate;
	private String locationOfDeath;

	// con
	public President() {

	}

	public President(String[] presidentDetails) {

		if (presidentDetails.length == 5) {
			this.name = presidentDetails[0];
			this.birthDate = presidentDetails[1];
			this.birthPlace = presidentDetails[2];
			this.deathDate = presidentDetails[3];
			this.locationOfDeath = presidentDetails[4];
		}

		else if (presidentDetails.length == 3 || presidentDetails.length == 4) {
			this.name = presidentDetails[0];
			this.birthDate = presidentDetails[1];
			this.birthPlace = presidentDetails[2];
		}

	}

	public String getName() {
		return name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public String getDeathDate() {
		return deathDate;
	}

	public String getLocationOfDeath() {
		return locationOfDeath;
	}

	public int getBirthYear() {
		String[] dob = this.birthDate.split(" ");
		return Integer.parseInt(dob[2]);
	}

	public int getDeathYear()
	{
		if (this.deathDate != null){
		
		String[] dob = this.deathDate.split(" ");
		return Integer.parseInt(dob[2]);
		}
		else return 2018;
	}
	// meth

}
