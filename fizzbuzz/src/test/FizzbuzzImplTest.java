package test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import fizzbuzz.FizzbuzzImpl;

public class FizzbuzzImplTest {

	@Test
	public void testFizzOrBuzz() {
		
		FizzbuzzImpl fb = new FizzbuzzImpl();
		
		int[] fizz = { 3, 6, 9, 12, 18 };
		int[] buzz = { 5, 10, 20 };
		int[] fizzBuzz = { 15 };
		
		for(int i = 1; i <= 20; i++){
			
			String verif = fb.fizzOrBuzz(i);
			
			if(Arrays.asList(fizz).contains(Integer.toString(i))) {
				if(verif != "Fizz")
					fail(i + " devrait être un Fizz");
			}
			else if(Arrays.asList(buzz).contains(Integer.toString(i))){
				if(verif != "Buzz")
					fail(i + " devrait être un Buzz");
			}
			else if(Arrays.asList(fizzBuzz).contains(Integer.toString(i))) {
				if(verif != "FizzBuzz")
					fail(i + " devrait être un FizzBuzz");
			}
			else if(Integer.toString(i) != verif)
				fail(i + " ne doit pas changer");
		}
	}

}
