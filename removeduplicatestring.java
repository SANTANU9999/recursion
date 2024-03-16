package myprac;

public class removeduplicatestring {
    public static boolean []present=new boolean[26];
    public static void sub(String s,int d, String m){
        if(d==s.length()){
            System.out.println(m);
            return;
        }
        char c=s.charAt(d);
        if(present[c-'a']){
            sub(s, d+1, m);
        }
        else{
            present[c-'a']=true;
            m+=c;
            sub(s, d+1, m);
        }
    }
    public static void main(String[] args) {
        String s="saaaammmmvduygughhf";
        sub(s, 0, "");
    }
}
