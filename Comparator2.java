import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class Comparator2 {
    public static void main(String args[]){
        Comparator<Integer> in= new Comparator<Integer>(){
                public int compare(Integer a, Integer b){
                    if(a%10>b%10){
                        return 1;
                    }
                    else return -1;
                }
        };
        List<Integer> arr= new ArrayList<>();
        arr.add(81);
        arr.add(89);
        arr.add(68);
        Collections.sort(arr,in);
        //for(int i=0;i<arr.length();i++){
            System.out.println(arr);
        //}
        
    }
}
