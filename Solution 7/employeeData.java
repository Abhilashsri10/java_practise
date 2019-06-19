package abhi.assignment;

public class employeeData {
    String name;
    int idNo;
    int age;
    int salary;//salary is in thousands i.e salary=10 then its 10k
    String workEthic;

    public employeeData(String a,int b,int c,int d,String e){
        this.name=a;
        this.idNo=b;
        this.age=c;
        this.salary=d;
        this.workEthic=e;
    }
    public void tell(){
        System.out.println(this.name+this.idNo+" is employee of "+this.age+" age and salary of "+salary+"K");
    }

    public int newSal(boolean whet,int bonus){
        return (whet?(this.salary=this.salary+bonus):this.salary);
    }

    public boolean isSelfMotivated(){
        if(this.workEthic=="strong")return true;
        else return false;
    }
    public static void main(String []arg){
        employeeData em1=new employeeData("Abhilash",1,23,50,"strong");
        employeeData em2=new employeeData("Lalit",2,22,30,"ok");
        employeeData em3=new employeeData("Rajat",3,25,40,"ok");
        employeeData em4=new employeeData("guru",4,22,60,"strong");
        // for abhilash
        System.out.println("emp1");
        em1.tell();
        System.out.println("updated salary "+em1.newSal(true,10));
        System.out.println("is employee self Motivated "+((em1.isSelfMotivated())?"True":"False"));
        // for guru
        System.out.println("emp2");
        em4.tell();
        System.out.println("updated salary "+em4.newSal(true,5));
        System.out.println("is employee self Motivated "+((em4.isSelfMotivated())?"True":"False"));

    }
}
