import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("its a Even Number");
        }else {
            System.out.println("its a ODD Number");
        }
    }
}
