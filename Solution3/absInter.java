package abhi.assignment;

abstract class abs implements inti{
    public void absPrint(){
        System.out.println("abstract class method");
    }
}

public class absInter extends abs{
        public void absPrint1(){
            System.out.println("is another method from interface");
        }
        public void absPrint2(){
            System.out.println("is the last function declared in interface");
        }
}

