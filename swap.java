import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // a=a+b;
        // b=a-b;
        // a=a-b;
        a=(a+b)-(b=a);
        System.out.println("After swapping: a = " + a + ", b = " + b);
        sc.close();
    }
    
}
