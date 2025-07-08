import java.util.*;
public class alice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int a=scanner.nextInt();
               int b=scanner.nextInt();
               int c=scanner.nextInt();
               int sum=a+b+c;
               float avg = sum/3;
               System.out.println("Sum:" +sum);
               System.out.printf("Average: %.2f" ,avg);
        
        
               scanner.close();

    }
    
}
