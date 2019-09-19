package Domaci09122019Calculator;

public class Main {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		double result= calc.Add(12).Div(2).Sub(2).Mult(20.5).Add(-5).value();
		System.out.println(result);


	}

}
