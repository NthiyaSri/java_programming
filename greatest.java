import java.util.*;
public class greatest {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
    //    int max=a;
    //    if(b>max)
    //     max=b;
    //     if(c>max)
    //     max=c;

    //    System.out.println("Greatest number is: " + max);
    System.out.println("Greatest number is: " + Math.max(a, Math.max(b, c)));
           
            sc.close();
    }
}
