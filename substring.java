package myprac;

public class substring {
    public static void subtring(String s,int d,String n){
        if(d==s.length()){
            System.out.println(n);
            return;
        }
        char c=s.charAt(d);
        subtring(s, d+1, n+c);
        subtring(s, d+1, n);
    }
    public static void main(String[] args) {
        String s="abc";
        subtring(s, 0, "");
    }
}
