import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("n = ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int Fib[] = new int[100];
        Fib[1] = 1;
        Fib[2] = Fib[1];
        System.out.print(Fib[1] + " " + Fib[2] + " ");
        for (int i = 3; i <= n; i++) {
            Fib[i] = Fib[i - 2] + Fib[i - 1];
            System.out.print(Fib[i] + " ");
        }
    }
}