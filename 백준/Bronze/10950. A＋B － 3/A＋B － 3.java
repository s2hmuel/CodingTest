import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        int i = 0;
        
        while(i < num){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            System.out.println(a+b);
            i++;
        }
    }
}