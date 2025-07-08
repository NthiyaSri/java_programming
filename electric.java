import java.util.Scanner;
public  class electric {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int u=sc.nextInt();
        float bill=0;
        if(u<=50) {
            bill =(float) (u * 0.50);
        } else if(u<=150) {
            bill = (float) (50*0.50 + (u - 50) * 0.75);
        } else if(u<=250) {
            bill = (float) (50 * 0.50 + 100 * 0.75 + (u - 150) * 1.20);
        } else {
            bill = (float) (u * 1.50);
        }
        bill += bill * 0.20; // Adding 20% surcharge
        System.out.println(bill);

       

        
        sc.close();
    }
    
}
