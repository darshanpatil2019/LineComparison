import java.util.Scanner;

public class LineLengthUC1 {
    public static void main(String[] args) {


    int x1, y1;
    int x2, y2;
    int length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x1, y1, x2, y2 ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        System.out.println(Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2));
    }


}
