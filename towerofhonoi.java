package myprac;
import java.util.*;
public class towerofhonoi {
    public static void toh(int n,String src,String helper, String dec){
        if(n==1){
            System.out.println( n + " disk is transfar " + src + " to " + dec);
            return;
        }
        toh(n-1,src,dec,helper);
        System.out.println( n + " disk is transfar " + src + " to " + dec);
        toh(n-1,helper,src,dec);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of disk");
        int n=sc.nextInt();
        toh(n,"S", "H","D");
    }
}
