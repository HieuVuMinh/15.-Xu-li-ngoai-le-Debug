import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập X: ");
            int x = sc.nextInt();
            System.out.println("Nhập Y: ");
            int y = sc.nextInt();

            CalculationExample calculationExample = new CalculationExample();
            calculationExample.Calculation(x, y);
        }while (true);

    }
    public void Calculation(int x, int y){
        try{
            int sum = x + y;
            int minus = x - y;
            int multiply = x * y;
            int divide = x / y;
            System.out.println("Tổng 2 số = " + sum);
            System.out.println("Hiệu 2 số = " + minus);
            System.out.println("Tích 2 số = " + multiply);
            System.out.println("Thương 2 số = " + divide);
        }catch (Exception e){
            if (e.getMessage().equals("/ by zero")){
                System.out.println("Có ngoại lệ do y = 0");

            }
        }
    }
}
