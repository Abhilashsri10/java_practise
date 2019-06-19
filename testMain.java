package library;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class testMain {
    public static libProp setBook(int a,String b,int c,int d,int e,boolean f,String date)throws Exception{

        Date dTemp = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        libProp libTemp = new libProp(a, b, c,d ,e, f, dTemp);
        return libTemp;
    }
    public static void main(String[] arg)throws Exception {
        Date dNew = new Date();
        ArrayList<libProp> ah = new ArrayList<libProp>();
        int entry = 5;
        while (entry > 0) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            String b = in.next();
            int c = in.nextInt();
            int d = in.nextInt();
            int e = in.nextInt();
            boolean f = in.nextBoolean();
            String date=in.next();
            ah.add(setBook(a, b, c, d, e, f, date));
            entry--;
        }
    }
}
