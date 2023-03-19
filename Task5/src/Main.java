import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("Введите вес на Земле: ");
        Scanner scan = new Scanner(System.in);
        float w = scan.nextFloat();
        w *= 0.17;
        System.out.print(w);
    }
}