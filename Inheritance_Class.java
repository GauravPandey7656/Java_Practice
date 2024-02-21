class Stud{
    int roll,marks;
    String name;
    void input(){
        System.out.println("Enter roll name and marks : ");
    }
}
class Ra extends Stud{
    void disp(){
        roll=1;name="rahul";marks=80;
        System.out.println(roll+" "+name+" "+marks);

    }
    public static void main(String[] args){
        Ra r=new Ra();
        r.input(); r.disp();
    }
}
