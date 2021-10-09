package week1.day2;

public class Calculator {

	
		int num1 = 11	;
		int num2 = 2;
		int num3 = 3;
		
		public int add()
		{
			int addresult = num1+num2+num3;
			System.out.println("The Addition result is " + addresult);
			return addresult;
		}
		
		public int sub()
		{
			int subresult = num1-num2;
			System.out.println("The Substraction result is " + subresult);
			return subresult;
		}
		
		public double mul()
		{
			double mulresult= num1*num2;
			System.out.println("The Multiplication result is " + mulresult);
			return mulresult;
		}
		
		public float div()
		{
			float divresult = num1/num2;
			System.out.println("The Division result is " + divresult);
			return divresult;
		}
		
		public static void main(String[] args) {
			
			Calculator MyCalculator = new Calculator();
			MyCalculator.add();
			MyCalculator.sub();
			MyCalculator.mul();
			MyCalculator.div();
			
	}

}
