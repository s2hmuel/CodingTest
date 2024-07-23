import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt(); 
        
        int c = b % 10;
        int d = b % 100;
        int e = d / 10;
        int f = b / 100;
        
        System.out.println(a*c);
        System.out.println(a*e);
        System.out.println(a*f);
        System.out.println(a*b);
    }
}