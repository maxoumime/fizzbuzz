package fizzbuzz;

import java.awt.List;

public class FizzbuzzImpl implements Fizzbuzz{

	@Override
	public List fizzOrBuzz() {

		List retour = new List();
		
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

	
}
