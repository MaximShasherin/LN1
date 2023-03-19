import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("a =");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        System.out.print("b =");
        double b = scan.nextDouble();
        System.out.print("c =");
        double c = scan.nextDouble();
        double d = b*b - 4*a*c;
        if (d<0){
            System.out.println("Корней нет");
        }
        else if(d == 0){
               double x = -b/2;
            }
        else{
            double x1 = (-b + Math.sqrt(d))/(2*a);
            double x2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}