import java.util.Scanner;
public class Main {
        public static void main(String[] args){
            System.out.print("n = ");
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            String S1[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
            String S2[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
            String S = "";
            S += S2[n / 10];
            S += S1[n % 10];
            System.out.print(S);
        }

    }