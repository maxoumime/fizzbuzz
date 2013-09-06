package fizzbuzz;

public class FizzbuzzImpl implements Fizzbuzz{

	@Override
	public String fizzOrBuzz(int i) {

		String retour = "";
		
		if( (i % 3) == 0)
			retour.concat("Fizz");
		
		if( (i % 5) == 0)
			retour.concat("Buzz");
		
		if(retour.isEmpty())
			retour = Integer.toString(i);
		
		return retour;
	}

	
}
