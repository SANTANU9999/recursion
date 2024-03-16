package recursion;

public class tilesplace {
    public static int place(int n, int m){
        if(n==m){
            return 2;
        }
        if (n<m) {
            return 1;
        }
        int verticali=place(n-m, m);
        int horizontal=place(n-1, m);
        return verticali+horizontal;
    }
    public static void main(String[] args) {
        int n=4,m=3;
        int s=place(n, m);
        System.out.println(s);
    }
}
