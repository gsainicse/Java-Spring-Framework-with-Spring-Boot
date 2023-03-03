
class A {
    String name="Gurdeep";
    class B{
        void show(){
            System.out.println("inside inner class");
        }
    }
    static class C{
        void show2(){
            System.out.println("inside C");     
           }
    }
}

class InnerClass1{
  public static void main(String args[]){
    A obj=new A();
    A.B obj2=obj.new B();  // without static
    obj2.show();
    A.C obj3=new A.C();   // with static
    obj3.show2();

  }
}