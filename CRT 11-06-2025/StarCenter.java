import java.util.Scanner;

public class StarCenter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        for (int i = 1; i <= num; i++) {
            for (int s = 1; s <= num - i; s++) {
                System.out.print(" ");
            }
            for (int j = 2*i-1; j >=  1; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
