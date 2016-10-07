import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class MyCalculatorTestDivide {
		Calculator calculator = new Calculator();
		public static final Logger LOG = Logger.getLogger(Calculator.class.getName());
		Random random = new Random();
		DecimalFormat df = new DecimalFormat("#,####");
		

	@Test
	public void testAddSmallPositiveNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		
		for (int i = 0; i <= 200; i++){
			firstNumber = Double.valueOf(df.format(random.nextDouble() *10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() *10));
			result = firstNumber / secondNumber;
			
			LOG.info("Testing the method add with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)) , Math.round( result));
		}
		
	}
	
	@Test
	public void testAddMediumPositiveNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		
		for (int i = 0; i <= 200; i++){
			firstNumber = Double.valueOf(df.format(random.nextDouble()* 100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() *100));
			result = firstNumber / secondNumber;
			
			LOG.info("Testing the method add with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)) , Math.round( result));
		}
		
	}
	@Test
	public void testAddBigPositiveNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		
		for (int i = 0; i <= 200; i++){
			firstNumber = Double.valueOf(df.format(random.nextDouble() *1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() *1000));
			result = firstNumber / secondNumber;
			
			LOG.info("Testing the method add with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)) , Math.round( result));
		}
		
	}


	@Test
	public void testAddSmallNegativeNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		
		for (int i = 0; i <= 200; i++){
			firstNumber = Double.valueOf(df.format(random.nextDouble() *-10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() *-10));
			result = firstNumber / secondNumber;
			
			LOG.info("Testing the method add with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)) , Math.round( result));
		}
		
	}
	
	@Test
	public void testAddMediumNegativeNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		
		for (int i = 0; i <= 200; i++){
			firstNumber = Double.valueOf(df.format(random.nextDouble() *-100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() *-100));
			result = firstNumber / secondNumber;
			
			LOG.info("Testing the method add with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)) , Math.round( result));
		}
		
	}
	@Test
	public void testAddBigNegativeNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		
		for (int i = 0; i <= 200; i++){
			firstNumber = Double.valueOf(df.format(random.nextDouble() *-1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() *-1000));
			result = firstNumber / secondNumber;
			
			LOG.info("Testing the method add with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)) , Math.round( result));
		}
		
	}
	@Test
	public void testAddZeroNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for (int i = 0; i <= 200; i++){
	
			result = firstNumber / secondNumber;
			
			LOG.info("Testing the method add with zero: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)) , Math.round( result));
		}
		
	}
}
