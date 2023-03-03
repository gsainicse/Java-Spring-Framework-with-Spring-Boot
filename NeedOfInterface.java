interface computer{
    void code();
}
class Laptop implements computer{
    public void code(){
        System.out.println("wroking on laptop");
    }
}
class Desktop implements computer{
    public void code(){
        System.out.println("wroking on Desktop");
    }
}
public class NeedOfInterface {
    public static void main(String args[]){
        computer obj;
        obj=new Laptop();
        obj.code();
        obj=new Desktop();
        obj.code();
    }    
}
