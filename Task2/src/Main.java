import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("a = ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.print("b = ");
        int b = scan.nextInt();
        System.out.print ("a / b = " + a / b + " и " + a % b + " в остатке");
    }
}