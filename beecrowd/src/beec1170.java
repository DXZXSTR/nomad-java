import java.util.Scanner;

public class beec1170 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            double C = in.nextDouble();
            int days = 0;
            while (C >= 1.0) {
                C /= 2.0;
                days++;
            }
            System.out.println(days + " dias");
        }
    }
}

