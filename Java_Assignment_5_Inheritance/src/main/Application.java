package main;


import model.AwesomePerson;
import model.ReallyAwesomePerson;

public class Application {
	public static void main(String[] args) {
		AwesomePerson ap1 = new AwesomePerson();
		ap1.talk();
		ReallyAwesomePerson rap1 = new ReallyAwesomePerson();
		rap1.talk();
	}

}
