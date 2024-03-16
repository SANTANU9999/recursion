package myprac;

public class rec_04 {
    public static void main(String[] args) {
        fac(10,1);
    }
    public static void fac(int num,int result){
        if(num==0){
            System.out.println(result);
        }else{
            result*=num;
            fac(num-1, result);
        }
    }
}
