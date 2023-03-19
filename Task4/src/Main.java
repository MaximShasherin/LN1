import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a, b, c;
        a = n / 100;
        b = (n / 10) % 10;
        c = n % 10;
        System.out.print(a + b + c);
    }
}