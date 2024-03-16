package recursion;

public class CountPathMaze {
    public static int plaza(int n,int m,int i,int j){
        if(i==n-1 || j==m-1){
            return 1;
        }
        int r=plaza(n, m, i, j+1);
        int d=plaza(n, m, i+1, j);
        return r+d;
    }
    public static void main(String[] args) {
        int n=4,m=5;
        int  p=plaza(n, m, 0, 0);
        System.out.println(p);
    }
}
