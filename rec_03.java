package recursion;

public class rec_03 {
    public static void main(String[] args) {
        sum(10,0);
    }
    public static void sum(int num,int result){
        if(num==0){
            System.out.println(result);
            return;
        }
        else{
            result+=num;
            sum(num-1,result);
        }
    }
}
