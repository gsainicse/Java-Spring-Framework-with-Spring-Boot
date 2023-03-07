public class Catch {
    public static void main(String args[]){
        try{
            int b=1/0;
        }
        catch(ArithmeticException e){
            System.out.println("oh we have exceptions"+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array  out of bound exception");
        }
    }
}
