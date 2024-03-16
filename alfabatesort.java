package myprac;

public class alfabatesort {
    public static void move(String s,int d,String m,int c){
        if(d==s.length()){
            for(int i=0;i<c;i++){
                m+='x';
            }
            System.out.println(m);
            return;
        }
        char g=s.charAt(d);
        if(g=='x'){
            c++;
            move(s, d+1, m, c);
        }else{
            m+=g;
            move(s, d+1, m, c);
        }
    }
    public static void main(String[] args) {
        String s="axbcxxxgfy";
        String m="";
        move(s, 0, m, 0);
    }
}
