package abhi.assignment.Solution9;

import java.util.Scanner;

public class Palindrome{
    public static void main(String []arg){
        Scanner in=new Scanner(System.in);

        int temp,oriNo,RevNo=0;
        oriNo=in.nextInt();
        temp=oriNo;
        while(oriNo>0){
            RevNo=(RevNo*10)+oriNo%10;
            oriNo/=10;
        }
        if(temp==RevNo)
            System.out.println("no. is Palindrome");
        else System.out.println("no. is not Palindrome");
    }
}
