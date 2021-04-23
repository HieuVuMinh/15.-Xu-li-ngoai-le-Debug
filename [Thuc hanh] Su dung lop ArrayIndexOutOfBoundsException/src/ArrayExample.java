import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random random = new Random();
        Integer[] array = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayExample arrayExample = new ArrayExample();
        Integer[] array = arrayExample.createRandom();
        System.out.println("\nNhập chỉ số của phần tử bất kì");
        int number = sc.nextInt();
        try{
            System.out.println("Giá trị của phần tử có chỉ số " + number + " là " + array[number]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
