package ex2_QA_winter_group_b.ex2_QA_winter_group_b;

import org.junit.jupiter.api.Assertions;

public class Tesr_questuin2 {
	@Test
	public void testDivisionByZerro()
	{
	WeakClass tester= new WeakClass();
	Assertions.assertThrows(ArithmeticException.class, () -> tester.weakMethod1(10, 0),  "Division by zero should throw ArithmeticException");}

	private void assertThrows(Class<ArithmeticException> class1, Object object, String string) {
		// TODO Auto-generated method stub
		
	}


}
