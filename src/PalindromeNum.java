import java.util.Scanner;

public class PalindromeNum {
    public boolean isPalindrome(int n){
        int originalNum = n;
        int reverseNum = 0;
        int reminder;

        if(n<0){
            return false;
        }
        while(n!=0){
            reminder = n%10;
            reverseNum = reverseNum*10 + reminder;
            n/=10;
        }
        return originalNum == reverseNum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        System.out.println(Num);
    }
}
