package occurance2;

import java.util.Scanner;

public class MainOcc2Nd {
    public static void main(String []arg){
        occ2Nd o=new occ2Nd();
        Scanner in=new Scanner(System.in);
        String inGive=in.nextLine();
        o.secOcc(inGive);
        //System.out.println((o.secOcc(inGive)!='#')?o.secOcc(inGive):"No char with second");
    }
}
