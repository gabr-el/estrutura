package entities;

public class Calculadora extends Interface {
	int num;
	int num2;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int soma(int num, int num2) {
		return num + num2;
	}

	public int sub(int num, int num2) {
		return num - num2;
	}

	public int div(int num, int num2) {
		return num / num2;
	}

	public int multi(int num, int num2) {
		return num * num2;
	}

	@Override
	public String toString() {
		return "Calculadora [num=" + num + ", num2=" + num2 + "]";
	}

}
