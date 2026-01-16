import java.util.Scanner;

public class FunctionMultiply {
    public static int MultiplyNumber(int a, int b){
        return a*b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(MultiplyNumber(a,b));
    }
}
