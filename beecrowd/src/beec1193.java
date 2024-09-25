import java.util.Scanner;

public class beec1193 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 1; i <= T; i++) {
            String value = in.next();
            String base = in.next();
            int decimalValue = 0;
            switch (base) {
                case "bin":
                    decimalValue = Integer.parseInt(value, 2);
                    break;
                case "dec":
                    decimalValue = Integer.parseInt(value);
                    break;
                case "hex":
                    decimalValue = Integer.parseInt(value, 16);
                    break;
            }
            System.out.println("Case " + i + ":");
            if (base.equals("bin")) {
                System.out.println(decimalValue + " dec");
                System.out.println(Integer.toHexString(decimalValue) + " hex");
            }
            else if (base.equals("dec")) {
                System.out.println(Integer.toBinaryString(decimalValue) + " bin");
                System.out.println(Integer.toHexString(decimalValue) + " hex");
            }
            else if (base.equals("hex")) {
                System.out.println(decimalValue + " dec");
                System.out.println(Integer.toBinaryString(decimalValue) + " bin");
            }
            System.out.println();
        }
    }
}
