package Simpson;

public class SimpsonTest {
	
	public static void main( String[] args) {
		
		JarraBiscoitos jar = new JarraBiscoitos();
		
		Homer homer = new Homer(jar);
		Marge marge = new Marge(jar);
		
		new Thread(homer).start();
		new Thread(marge).start();

	}

}
