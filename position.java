import java.util.Scanner;
public class position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int one=arr[0];
        for(int i=0;i<n-1;i++)
          arr[i]=arr[i+1];

        arr[n-1]=one;
        for(int i=0;i<n;i++)
          System.out.print(arr[i]+" ");
       
        sc.close();
    }
}
