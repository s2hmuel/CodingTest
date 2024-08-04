import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int total = a*60+b+c;
        int m = total%60;
        int h = (total/60)%24;
           
      
        System.out.println(h+" "+m);
    }
}