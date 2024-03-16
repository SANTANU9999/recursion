package myprac;
import java.util.*;
public class recurtion_01 {
    public static void main(String[] args) {
      rec(10);
    }
    public static int rec (int num){
        if(num==0){
           // return 0;
        }
        else{
            System.out.print(num +" ");
            rec(num-1);
        }
       return num;
    }
}
