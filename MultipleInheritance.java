interface A{
    void show();
}
interface B{
    void run();

}
interface X extends A,B{

}
class z implements X{
    public void show(){
        System.out.println("this is show methods");
    }
    public void run(){
        System.out.println(" i am running");
    }
}
public class MultipleInheritance {
    public static void main(String args[]){
        z obj=new z();
        obj.run();
        obj.show();


    }
    
}
