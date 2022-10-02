package AreaOfARectangle;
import java.util.Scanner;
public class AreaOfARectangle {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the lenght of rectangle:");
		double lenght = scanner.nextDouble();
		System.out.println("enter the width of the rectangle:");
		double width =scanner.nextDouble();
		double area = lenght*width;
		System.out.println("area of the rectangle is:"+area);
		

	}

}
