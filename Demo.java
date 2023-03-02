
import java.util.*;
class Calculator{


    public int sum(int a, int b){
    return a+b;
    }
}
public class Demo{
    public static void main(String[] args) {
        int num1=1;
        int num2=3;
        Calculator cal= new Calculator();
        System.out.println(cal.sum(num1,num2));
    }
}