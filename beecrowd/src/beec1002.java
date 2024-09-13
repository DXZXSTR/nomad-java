import java.util.Scanner;

public class beec1002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double r = in.nextDouble();
        double result = 3.14159 * r * r;

        System.out.printf("A=%.4f\n",result);
    }
}
