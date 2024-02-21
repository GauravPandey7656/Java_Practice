class A
{
    void show()
    {
        System.out.println("Hello Viewer");
    }
}
class B extends A
{
    void show()
    {
        System.out.println("Hello learn");
    }
}
class Test()
{
    public static void main(String[] args){
        B r=new B();
        r.show();
    }
}




