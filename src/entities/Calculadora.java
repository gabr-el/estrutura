package entities;

public class Calculadora extends Interface {
	double num;
	double num2;

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

	public double soma(double num, double num2) {
		return num + num2;
	}

	public double sub(double num, double num2) {
		return num - num2;
	}

	public double div(double num, double num2) {
		return num / num2;
	}

	public double multi(double num, double num2) {
		return num * num2;
	}

	public double potencia(int num, int num2) {
		return Math.pow(num, num2);
	}
	public double raiz1(int num) {
		return Math.sqrt(num);
	}
	public double raiz2(int num2) {
		return Math.sqrt(num2);
	}

	@Override
	public String toString() {
		return "Calculadora [num=" + num + ", num2=" + num2 + "]";
	}

}
