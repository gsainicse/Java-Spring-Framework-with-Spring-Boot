class GurdeepException extends Exception{
    public GurdeepException(String sg){
        super(sg);
    }
}
public class MyException{
    public static void main(String args[]){
        try{
            int n=0;
            if(n==0)
            throw new GurdeepException("gd");
        }
        catch(GurdeepException e){
            System.out.println(e);
        }
    }
}