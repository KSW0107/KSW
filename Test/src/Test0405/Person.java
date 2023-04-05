package Test0405;

public class Person {
	String ssn;
	String name;
	String adress;
	
	public Person() {
	}
	
	public Person(String ssn, String name,String adress) {
		this.adress = adress;
		this.name =name;
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
}
