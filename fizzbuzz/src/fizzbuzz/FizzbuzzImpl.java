package fizzbuzz;

import java.util.ArrayList;

public class FizzbuzzImpl implements Fizzbuzz{

	@Override
	public ArrayList<String> fizzOrBuzz() {

		ArrayList<String> retour = new ArrayList<String>();
		
		for(int i = 1; i <= 100; i++) {
			String valeur = "";
			
			if( (i % 3) == 0)
				valeur.concat("Fizz");
			
			if( (i % 5) == 0)
				valeur.concat("Buzz");
			
			if(valeur.isEmpty())
				valeur = Integer.toString(i);
			
			retour.add(valeur);
		}
		
		return retour;
	}

	@Override
	public ArrayList<String> fizzOrBuzz2() {

		ArrayList<String> retour = new ArrayList<String>();
		
		for(int i = 1; i <= 100; i++) {
			
			String valeur = "";
			String iString = Integer.toString(i);
			
			if( ((i % 3) == 0) || iString.contains("3") )
				valeur.concat("Fizz");
			
			if( (i % 5) == 0 || iString.contains("5"))
				valeur.concat("Buzz");
			
			if(valeur.isEmpty())
				valeur = Integer.toString(i);
			
			retour.add(valeur);
		}
		
		return retour;
	}
	
	

	
}
