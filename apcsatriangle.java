import java.util.Scanner;

public class apcsatriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter a height: ");
        double height = in.nextDouble();

        System.out.print("Enter a base: ");
        double base = in.nextInt();

        double area = (height * base)/2;

        System.out.print("\nThe area of triangle with a height and base of ");
        System.out.printf("%.1f", height);
        System.out.print( " and ");
        System.out.printf("%.1f", base);
        System.out.print(" is ");
        System.out.printf("%.1f", area);
        System.out.print(".");
        in.close();
    }
}
