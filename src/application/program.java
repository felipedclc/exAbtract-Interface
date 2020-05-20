package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Retangle;
import entities.Shape;
import entities.enums.Color;

public class program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Shape s1 = new Circle(Color.BLUE, 2.0);
		Shape s2 = new Retangle(Color.WHITE, 3.0, 4.0);
		
		System.out.println("Cicle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("&.2f",s1.area()));
		System.out.println("Retangle color: " + s2.getColor());
		System.out.println("Retangle area: " + String.format("%.2f",s2.area()));
		
		
		sc.close();
	}
}
