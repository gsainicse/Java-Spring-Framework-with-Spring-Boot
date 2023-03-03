
abstract class A{
      public abstract void show();
}

public class AbstractAnonymousClass {
    public static void main(String args[]){
        A obj =new A(){
            public void show(){
                System.out.println("in anonymous class");
            }
        };
        // this is how we can create the methods of abstract class
        obj.show();
    }
}
