package exceptionhandle;

class IllegalAgeException extends Exception {
	public String getMessage() {
		return "the person needs to be 18";
	}

}

class Voter {
	public void register(int age) throws IllegalAgeException {
		if (age < 18) {
			throw new IllegalAgeException();
		}
	}
}

public class MainClass {

	public static void main(String[] params) {

		Voter voter = new Voter();
		try {
			voter.register(31);
		} catch (IllegalAgeException e) {
			e.printStackTrace();

		}
	}

}