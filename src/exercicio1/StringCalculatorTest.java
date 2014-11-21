package exercicio1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

	private StringCalculator calculadora;
	
	@Before
	public void setUp(){
		calculadora = new StringCalculator();
	}
	
	@Test
	public void retorna0QuandoAddReceberString0(){
		
		String result = calculadora.add("0"); 
		String expected = "0";
				
		assertEquals(expected, result);
	}
	
	@Test
	public void retorna1QuandoAddReceberString1(){
		
		String result = calculadora.add("1"); 
		String expected = "1";
				
		assertEquals(expected, result);
	}
	
	@Test
	public void retorna0QuandoAddReceberStringVazia(){
		
		String result = calculadora.add(""); 
		String expected = "0";
				
		assertEquals(expected, result);
	}




}
