package abhi.assignment;

import java.math.BigDecimal;
import java.util.Scanner;

public class addBigDec {
    public static void main(String []arg){
        Scanner in=new Scanner(System.in);
            BigDecimal b1 = in.nextBigDecimal();
            BigDecimal b2 = in.nextBigDecimal();

        System.out.println(b1.add(b2));
    }
}
