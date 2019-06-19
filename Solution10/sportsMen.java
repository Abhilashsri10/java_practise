package abhi.assignment;

public class sportsMen{
    String name;
    int age;
    int overallEstate;

    public sportsMen(String a,int b,int c){
        this.name=a;
        this.age=b;
        this.overallEstate=c;
    }
    public void tell(){
        System.out.println(this.name+" is of age:"+this.age+"and has "+this.overallEstate);
    }
}
