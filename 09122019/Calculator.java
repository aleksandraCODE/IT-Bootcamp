package Domaci09122019Calculator;

public class Calculator {
	private double value;

	public Calculator Add(double c) {
		value = value + c;
		return this;

	}

	public Calculator Sub(double c) {
		value = value - c;
		return this;

	}

	public Calculator Div(double c) {
		value = value / c;
		return this;
	}

	public Calculator Mult(double c) {
		value = value * c;
		return this;
	}

	public double value() {
		return value;
	}

}
