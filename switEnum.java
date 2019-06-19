package abhi.assignment;

public class switEnum {
    enum singers{
        MATT,JAMES,COREY,KURT,COBAIN;
    }
    public static void main(String []arg){
        singers s=singers.MATT;
        switch (s){
            case JAMES:
                System.out.println("belongs to metallica");
                break;
            case KURT:
                System.out.println("belongs to nirvana");
                break;
            case COREY:
                System.out.println("belongs to slipknot");
                break;
            case MATT:
                System.out.println("belongs to BFMV");
                break;
             default:
                 System.out.println("doesn't belongs to any band");

        }
    }
}
