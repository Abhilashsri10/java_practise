package library;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class libProp {
    int bookID;
    String bookName;
    int price;
    int edition;
    int noOfCopies;
    boolean issued;
    Date d1;

    public libProp(int a, String b, int c, int d, int e, boolean f, Date d2) {
        this.bookID = a;
        this.bookName = b;
        this.price = c;
        this.edition = d;
        this.noOfCopies = e;
        this.issued = f;
        this.d1 = d2;
    }

    public void bookInfo() {
        System.out.println(this.bookID + this.bookName + this.edition);
    }

    public double Fine(Date d, int fineRs) {
        long diff = this.d1.getTime() - d.getTime();
        long days = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        double totalFine = 10;
        if (days > 10 && days <= 15) return (totalFine += ((days - 10) * 2));
        else if (days > 15 && days <= 30) return (totalFine += (5 * 2) + (days - 15) * 5);
        else if (days > 30)
            return totalFine += (5 * 2 + 5 * 5 + (days - 30) * 100);
        return 0;
    }

    public void updBook(int a, String b, int c, int d, int e, boolean f, Date d2) {
        this.bookID = a;
        this.bookName = b;
        this.price = c;
        this.edition = d;
        this.noOfCopies = e;
        this.issued = f;
        this.d1 = d2;
    }

}