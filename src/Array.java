import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
          //input
        for(int i=0; i< number.length; i++){
            number[i] = sc.nextInt();
        }
          //output
        for(int i=0; i<number.length; i++){
            System.out.println(number[i]);
        }
    }
}
