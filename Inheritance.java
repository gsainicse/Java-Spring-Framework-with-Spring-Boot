class A{
    public A(){
        System.out.println("i am in a");
    }
    public A(int n){
        System.out.println("parameterised is A called");
    }
}
class B extends A{
    public B(){
        System.out.println("B is called");
    }
    public B(int n){
        super(n);
        System.out.println("parameterized is called");
    }
}
public class Inheritance{
    public static void main(String[] args){
        B b1=new B();
        B b2=new B(10);

    }

}
