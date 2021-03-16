public class main2 {

    static void quickSort(int[]a,int l,int r) {
        if (l == r) return;
        int mid = (r + l) / 2;
        int midValue = a[mid];
        int R = r, L = l;

        while (R >= L) {
            while (a[L] < midValue) L++;
            while (a[R] > midValue) R--;

            if (R >= L) {
                int bf = a[R];
                a[R] = a[L];
                a[L] = bf;
                R--;
                L++;
            }
        }
        if(R>l)quickSort(a, l, R);
        if(r>L)quickSort(a, L, r);

    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 32, 5, 67, 76, 5, 999,1000};

        quickSort(arr,0,arr.length-1);


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}