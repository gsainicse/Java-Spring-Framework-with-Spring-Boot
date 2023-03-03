class A{
    void show(){
        System.out.println("inside the A class");
    }
}
public class AnonymousClass {
    public static void main(String args[]){
        A obAj=new A(){
            void show(){
                System.out.println("new class called");
            }
        };
        obAj.show();
    }
}
