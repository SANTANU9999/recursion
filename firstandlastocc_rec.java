package myprac;

public class firstandlastocc_rec {
   public static int l=-1,f=-1;
    public static void firstlast(String s,char e1,int d){
        if(d==s.length()){
            return;
        }
           
        if(s.charAt(d)==e1){
            if(f==-1){
                f=d;
            }else{
                l=d;
            }
        }
        
        firstlast(s, e1,d+1);
    }
    public static void main(String[] args) {
        String s="Santanusamanta";
        char e='a';
        //firstlast(s, 0, "a");
        firstlast(s, e,0);
        System.out.println("First occurence : " + f);
        System.out.println("Last occurence : " + l);
    }
}
