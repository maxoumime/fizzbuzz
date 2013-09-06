package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import fizzbuzz.Fizzbuzz;
import fizzbuzz.FizzbuzzImpl;

public class FizzbuzzImplTest {

	@Test
	public void testFizzOrBuzz() {
		
		Fizzbuzz fb = new FizzbuzzImpl();
		
		int[] fizz = { 3, 6, 9, 12, 18, 21, 24, 27, 33, 36, 39, 42, 48, 51, 54, 57, 63, 66, 69, 72, 78, 81, 84, 87, 93, 97 };
		int[] buzz = { 5, 10, 20, 25, 35, 40, 50, 55, 65, 70, 80, 85, 95, 100};
		int[] fizzBuzz = { 15, 30, 45, 60, 75, 90 };
		
		ArrayList<String> liste = fb.fizzOrBuzz();
		
		for(int i = 1; i <= 100; i++){
			
			String verif = liste.get(i-1);
			String iString = Integer.toString(i);
			
			if(Arrays.asList(fizz).contains(iString)) {
				if(verif != "Fizz")
					fail(i + " devrait être un Fizz");
			}
			else if(Arrays.asList(buzz).contains(iString)){
				if(verif != "Buzz")
					fail(i + " devrait être un Buzz");
			}
			else if(Arrays.asList(fizzBuzz).contains(iString)) {
				if(verif != "FizzBuzz")
					fail(i + " devrait être un FizzBuzz");
			}
			else if(!iString.matches(verif))
				fail(i + " ne doit pas changer");
		}
	}
	
	@Test
	public void testFizzOrBuzz2() {
		
		Fizzbuzz fb = new FizzbuzzImpl();
		
		int[] fizz = { 3, 6, 9, 12, 18, 21, 24, 27, 33, 36, 39, 42, 48, 63, 66, 69, 72, 78, 81, 84, 87, 93, 97 };
		int[] fizz2 = { 13, 23, 33, 34, 37, 38, 43, 53, 73, 83 }; 
		int[] buzz = { 5, 10, 20, 25, 40, 50, 55, 65, 70, 80, 85, 95, 100};
		int[] buzz2 = { 52, 53, 55, 56, 58, 59 };
		int[] fizzBuzz = { 15, 30, 45, 60, 75, 90 };
		int[] fizzBuzz2 = { 35, 51, 54, 57 };
		
		ArrayList<String> liste = fb.fizzOrBuzz();
		
		for(int i = 1; i <= 100; i++){
			
			String verif = liste.get(i-1);
			String iString = Integer.toString(i);
			
			if(Arrays.asList(fizz).contains(iString) || Arrays.asList(fizz2).contains(iString)) {
				if(verif != "Fizz")
					fail(i + " devrait être un Fizz");
			}
			else if(Arrays.asList(buzz).contains(iString) || Arrays.asList(buzz2).contains(iString)){
				if(verif != "Buzz")
					fail(i + " devrait être un Buzz");
			}
			else if(Arrays.asList(fizzBuzz).contains(iString) || Arrays.asList(fizzBuzz2).contains(iString)) {
				if(verif != "FizzBuzz")
					fail(i + " devrait être un FizzBuzz");
			}
			else if(!iString.matches(verif))
				fail(i + " ne doit pas changer");
		}
	}
}
