
enum Status{
    Running, Failed, Pending, Success;
}
public class EnumDemo{
    public static void main(String args[])
    {
        Status a=Status.Running;
        System.out.println(a);
        Status[] ab=Status.values();
        for(Status b:ab){
            System.out.println(b);
        }
    }
}
