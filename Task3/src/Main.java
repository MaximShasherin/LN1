import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int i = 0;
        while (s.charAt(i) == s.charAt(s.length() - i - 1) && i <= s.length()/2){
            i += 1;
        }
        if(i == s.length()/2 + 1){
            System.out.print("Является");
        }  else{
            System.out.print("Не является");
        }
    }
}