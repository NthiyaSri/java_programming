import java.util.Scanner;
public class hijack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int cout=0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
               if(i==j) {
                 if(a[i][j]>18 && a[i][j]<60)
                    cout++;
                }

            }
        }
        System.out.println(cout);
        sc.close();

    }
    
}
