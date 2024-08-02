import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        
        if (m < 45){
            h = h -1;
            m = m + 15;
            if(h < 0){
                h = 23;
            }
        }
        else {
            m = m - 45;
        }
        System.out.println(h+" "+m);
    }
}