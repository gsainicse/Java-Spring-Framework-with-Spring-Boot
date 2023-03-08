public class runableClass {
    
}
class A extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
        System.out.println("in A");
        try{
            Thread.sleep(10);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
        System.out.println("in B");
        try{
            Thread.sleep(10);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
}
public class runableClass {
    public static void main(String args[]){
    A a1= new A();
    B b1= new B();
    a1.start();
    b1.start();
    }
    
}
