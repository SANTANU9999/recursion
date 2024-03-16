package myprac;

public class rec_02 {
    public static void main(String[] args){
        re(10);
    }
    public static void re(int num){
        if(num==0){
            return;
        }else{
            re(num-1);
            System.out.print(num +" ");
        }
    }
}
