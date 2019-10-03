
import java.util.Scanner;


public class Demo2{

    public static void main(String args[]) {
        int length = 0;
        int breadth = 0;
        int area = 0;

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle");
        length = reader.nextInt();

        breadth = reader.nextInt();
        area = length*breadth;

        System.out.println("Area of Rectangle : "+area);
    }

}