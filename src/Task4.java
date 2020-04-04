import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате и нажмите Enter: ");
        String binaryNumber = scan.nextLine();
        char[] chars = binaryNumber.toCharArray();
        int decimalNumber = 0;
        int degree = 1;
        for (int i = binaryNumber.length()-1; i >= 0; i--) {
            if (chars[i]=='1') {
                decimalNumber += degree;
            }
            degree*=2;
        }
        System.out.printf("Ваше число в десятичном формате: %d", decimalNumber);
        scan.close();
    }
}
