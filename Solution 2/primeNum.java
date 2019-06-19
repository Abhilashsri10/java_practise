package abhi.assignment;

import java.util.ArrayList;

public class primeNum {
    public static boolean isPrimeNum(int c){
        int flag=0;
        for(int i=2;i<Math.sqrt(c);i++){
            if(c%i==0)return false;
            flag=1;
            break;
        }
        return ((flag==0)?false:true);
    }
    public static void printArr(ArrayList<Integer> a){
        for(int c:a){
            System.out.println(c);
        }
    }
    public static void main(String []arg){
        int count=1;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        while(count<100){
            count++;
            if(isPrimeNum(count)) arr.add(count);
        }
        printArr(arr);
    }
}
