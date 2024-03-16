package myprac;

public class rec_05 {
    public static void main(String[] args) {
        fib(1,0,10);
    }
    public static void fib(int n,int m,int s){
        if(s==0){

        }
        else{
            System.out.print(m+" ");
            fib(m,m+n,s-1);
        }
    }
}
