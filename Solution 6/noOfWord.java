package abhi.assignment;

import java.util.Scanner;

public class noOfWord {
    public static void main(String []arg){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            if((i>0)&&(s.charAt(i)!=' ')&&(s.charAt(i-1)==' ')){
                count++;
            }
        }
        System.out.println((++count)+" words");
    }

}
