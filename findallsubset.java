package recursion;

import java.util.ArrayList;

public class findallsubset {
    public static void print(ArrayList<Integer>sub){
        for(int i=0;i<sub.size();i++){
            System.out.print(sub.get(i)+" ");
        }
        System.out.println(" ");
    }
    public static void set(int n,ArrayList<Integer>sub){
        if(n==0){
            print(sub);
            return;
        }
        sub.add(n);
        set(n-1, sub);

        sub.remove(sub.size()-1);
        set(n-1, sub);
    }
    public static void main(String[] args) {
        ArrayList<Integer>subset=new ArrayList<Integer>();
        int n=4;
        set(n, subset);
    }
}
