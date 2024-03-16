package myprac;

public class sortchackinarr_rec {
    public static boolean sorts(int[] arr, int d) {
        if (d == arr.length - 1) {
            return true;
        }
        if (arr[d] < arr[d +1]) {
            return sorts(arr, d + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,0,3,4};
        boolean b=sorts(arr, 0);
        System.out.println(b);
    }
}
