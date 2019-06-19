package abhi.assignment;

import java.util.Scanner;

public class noOfOccur {
    public static void  main(String []arg){
        int []arr=new int[255];
        Scanner in =new Scanner(System.in);
        String s=in.nextLine();
        int l=s.length();
        for(int i=0;i<l;i++){
            //int a=c;
            //int n=(a-97);
            arr[s.charAt(i)]++;
        }
        for(int k=0;k<l;k++){
            //int a=c;
            //int n=(a-97);
            System.out.println(s.charAt(k)+":"+arr[s.charAt(k)]);
        }
    }
}
