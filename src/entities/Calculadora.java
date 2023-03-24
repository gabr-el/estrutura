package entities;

public class Calculadora implements Interface {
	double num;
	double num2;

	public Calculadora() {

	}

	public Calculadora(double num, double num2) {
		this.num = num;
		this.num2 = num2;
	}

	public double getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	@Override
	public double soma() {
		return num + num2;
	}

	@Override
	public double sub() {
		return num - num2;
	}

	@Override
	public double div() {
		return num / num2;
	}

	@Override
	public double multi() {
		return num * num2;
	}

	@Override
	public double potencia() {
		return Math.pow(num, num2);
	}

	@Override
	public double raiz1() {
		return Math.sqrt(num);
	}

	@Override
	public double raiz2() {
		return Math.sqrt(num2);
	}

	@Override
	public double log1() {
		return Math.log(num);
	}

	@Override
	public double log2() {
		return Math.log(num2);
	}

	@Override
	public String toString() {
		return "Calculadora [num=" + num + ", num2=" + num2 + "]";
	}

}
