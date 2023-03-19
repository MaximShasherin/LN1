import java.util.Scanner;
import java.lang.Math;
public class Main{
        public static void main(String[] args) {
            int count;
            System.out.print("Введите число, которое нужно проверить на простоту ");
            Scanner scan = new Scanner(System.in);
            count = scan.nextInt();
            boolean div = false;
            int d = (int)Math.sqrt(count);
            for(int j = 2; j <= d; j++){
                if (count % j == 0){
                    div = true;
                    System.out.println("Составное");
                    break;
                }
            }
            if (div == false){
                System.out.println("Простое ");
            }
        }
    }
