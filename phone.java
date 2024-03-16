package myprac;



public class phone {
    public static String[] sr={".", "abc", "def", "ghi", "jkl", "mno", "pqrs","tu", "vwx", "yz"};
    public static void ph(String s, int d,String m){
        if(d==s.length()){
            System.out.println(m);
            return;
        }
        char c=s.charAt(d);
        String news=sr[c-'0'];
       for(int i=0;i<news.length();i++){
        char curr = news.charAt(i);
        ph(s, d+1,m+curr);
       }
    }
    public static void main(String[] args) {
        String s="23";
        ph(s, 0, "");
    }
}
