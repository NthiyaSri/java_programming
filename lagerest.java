import java.util.Scanner;

public class lagerest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int arr[]= new int[10];
        int max = 0;
        for(int i=0; i<a; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]>max){
                max = arr[i];
            }
            
        }
        System.out.println(max);
        sc.close();
    }
}
