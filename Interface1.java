interface A{
    int a=10; // by default is is final and static
    int b=99;
    void show();  /// by default it is abstract and final
} 
class Intt implements A{
    public void show(){
        System.out.println("in implemented class");
    }
}

public class Interface1 {
    public static void main(String args[]){
        A obj1=new Intt();
        obj1.show();
        System.out.println(A.a);
        System.out.println(obj1.b);  // statc field should be accessed in a static way as above

    }
}
