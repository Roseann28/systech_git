import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        int English,Chemistry,Physics;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter English marks:");
        English=scan.nextInt();
        System.out.println("Enter Chemistry marks:");
        Chemistry=scan.nextInt();
        System.out.println("Enter Physics marks:");
        Physics=scan.nextInt();
        int average=(English+Chemistry+Physics)/3;
        System.out.println("Average is:"+ average);
    }
}
