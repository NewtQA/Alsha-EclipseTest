package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import application.MathProvider;

public class JUnitMathProvider_1 {
	MathProvider provider;

	public JUnitMathProvider_1() {
		provider=new MathProvider();
	}

	@Test
	public void add() {
		System.out.println("Starting test"+new Object(){}.getClass().getEnclosingMethod().getName());
		int num1=20;
		int num2=90;
		assertEquals(num1+num2, provider.add(num1, num2));
		System.out.println("Ending test"+new Object(){}.getClass().getEnclosingMethod().getName());
	}
	@Test
	public void subtract() {
		System.out.println("Starting test"+new Object(){}.getClass().getEnclosingMethod().getName());
		int num1=20;
		int num2=90;
		assertEquals(num1-num2, provider.substract(num1, num2));
		System.out.println("Ending test"+new Object(){}.getClass().getEnclosingMethod().getName());
	}

}
