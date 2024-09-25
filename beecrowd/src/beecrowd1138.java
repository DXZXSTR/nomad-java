import java.util.Scanner;

public class beecrowd1138 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int A = in.nextInt();
            int B = in.nextInt();
            int[] count = new int[10];
            for (int i = A; i <= B; i++) {
                String numStr = Integer.toString(i);
                for (char digit : numStr.toCharArray()) {
                    count[digit - '0']++;
                }
            }
            for (int i = 0; i < 10; i++) {
                System.out.print(count[i]);
                if (i < 9) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
