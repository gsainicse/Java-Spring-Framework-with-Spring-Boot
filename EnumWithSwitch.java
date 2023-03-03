enum Status{
    Running, Failed, Pending, Passed;
}

public class EnumWithSwitch{
        public static void main(String args[]){
            Status s= Status.Running;
            if(s==Status.Running){
                System.out.println("running");
            }
            else if(s== Status.Failed){
                System.out.println("Failed");
            }

            switch(s){
                case Running:
                System.out.println("yes running");
                break;
                case Failed:
                System.out.println("failed");
                break;

            }

        }
}
