class Human{
    int age;
    String name;
    public Human(){
        this.age=1;
        this.name="Saini";
    }
    public Human(int age, String name){
        this.age=age;
        this.name=name;
    }

}
public class Constructor1 {
    public static void main(String[] args){
        Human m1=new Human();
        System.out.println(m1.name);    
    }
}
