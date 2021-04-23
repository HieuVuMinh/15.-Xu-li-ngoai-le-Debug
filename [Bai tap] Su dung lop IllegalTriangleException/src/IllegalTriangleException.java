import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) throws NegativeNumber, EnteredIncorrect {
        System.out.println("Nhập vào 3 cạnh của tam giác");
        Scanner sc = new Scanner(System.in);
//        try {
            System.out.println("Nhập a: ");
            int a = sc.nextInt();
            System.out.println("Nhập b: ");
            int b = sc.nextInt();
            System.out.println("Nhập c: ");
            int c = sc.nextInt();

            if ((a < 0) || (b < 0) || (c < 0)) {
                throw new NegativeNumber();
            }
            if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
                throw new EnteredIncorrect();
            }

    }
}
