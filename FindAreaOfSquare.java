package AreaOfSquare;
import java.util.Scanner;

public class FindAreaOfSquare {

	public static void main(String[] args) {
		System.out.println("enter side of square:");
		Scanner scanner =new Scanner(System.in);
		double side = scanner.nextDouble();
		double area = side*side;
		System.out.println("area of  square is :"+area);
		

	}

}
