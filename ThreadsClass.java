class A implements Runnable {
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

class B implements Runnable{
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
public class ThreadsClass {
    public static void main(String args[]){
    Runnable a1= new A();
    Runnable b1= new B();

    Thread aa= new Thread(a1);
    Thread bb= new Thread(b1);
        
    aa.start();
    bb.start();
    }
    
}
