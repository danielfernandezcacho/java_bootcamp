package ej2;

public class Ej2_2 {

	public static void main(String[] args) {
		Integer num1=100;
		Integer num2=25;
		
		int n1=num1.intValue();
		int n2=num2.intValue();
		System.out.println("Suma de numeros "+n1+" y "+n2+" vale "+(n1+n2));
		if (n1+n2>130)
			n1++;
		else
			n1--;
		System.out.println(n1);

	}

}
