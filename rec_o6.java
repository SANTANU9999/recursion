package myprac;

public class rec_o6 {
    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }

    public static int power(int x, int y) {
        if (y == 0) {
            return 1;
        }

        int m_ = power(x, y - 1);
        System.out.println(m_ +" ");
        m_ = x * m_;
        return m_;
        // return m;

    }
}
