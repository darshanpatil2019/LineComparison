import java.util.Objects;
import java.util.Scanner;

public class EqualLinesUC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double length[] = new double[2];
        //user inputs

        for (int i = 0; i < 2; i++) { // loop for length

            System.out.println((i + 1) + "." + "Enter the values for x1,y1,x2,y2");
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            //Calculate length of line and store in array
            length[i] = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
            System.out.println("Length of line " + (i + 1) + " : " + length[i]);
        }

        //Checking Equality of two Lines
        if (Objects.equals(length[0], length[1])) {
            System.out.println("The Length of Two Lines are Equal");
        } else {
            System.out.println("The Length of Two Lines are not Equal");
        }
    }
}
