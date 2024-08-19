import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int totalPrice = scanner.nextInt();
        int num = scanner.nextInt();
        int i = 0;
        int sum = 0;
        while(i < num){
            int price = scanner.nextInt();
            int count = scanner.nextInt();
            
            sum = sum + (price * count);
            i++;
        }
        if (totalPrice == sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
