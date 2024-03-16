package recursion;

public class gastcalling {
    public static int calling(int n){
        if(n<=1){
            return 1;
        }
        int singalwya=calling(n-1);
        int pairtowway=(n-1)*calling(n-2);
        return singalwya+pairtowway;
    }
    public static void main(String[] args) {
        int n=4;
        int p=calling(n);
        System.out.println(p);
    }
}
