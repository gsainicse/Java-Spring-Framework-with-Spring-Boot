import java.net.SocketPermission;

public class Wrapper1 {
    public static void main(String args[]){
        int a=10;
        Integer aa=new Integer(a); /// boxing
        Integer b= a;  // autoboxing
        String s="17";

        //int newNumber=b;  // auto Unboxing 
        Integer myNum=Integer.parseInt(s);   
        System.out.println(myNum);

    }
}
