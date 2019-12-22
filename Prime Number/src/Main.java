import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int count=0;
        System.out.println("Enter any number");
        number = sc.nextInt();
        for (int i=2;i<number;i++){
            if (number%i==0){
                count++;
                break;
            }
        }
        if (count==0){
            System.out.println("prime number");
        }
        else System.out.println("not prime");
    }
}
