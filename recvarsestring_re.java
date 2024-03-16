package myprac;

public class recvarsestring_re {
    public static void revarse(String str, int l){
        if(l==0){
            System.out.print(str.charAt(l));
            return;
        }
        System.out.print(str.charAt(l));
        revarse(str, l-1);
    }
    public static void main(String[] args) {
        String s= "SANTANU";
        revarse(s, s.length()-1);
        
    }
}
