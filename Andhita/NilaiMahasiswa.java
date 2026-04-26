public class NilaiMahasiswa {

    // Divide dan Conquer (maksimum)
    public static int maxUTS(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }

        int mid = (l + r) / 2;
        int kiri = maxUTS(arr, l, mid);
        int kanan = maxUTS(arr, mid + 1, r);

        return Math.max(kiri, kanan);
    }

    // Divide dan canquer (minimum)
    public static int minUTS(int[] arr, int l, int r) {
        if (l == r) {
        return arr[l];
    }
     
    int mid = (l + r) / 2;
    int kiri = minUTS(arr, l, mid);
    int kanan = minUTS(arr, mid + 1, r);
    return Math.min(kiri, kanan);
    }

    //Brute force (rata-rata)
    public static double rataUAS(int [] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return (double) total / arr.length;
    }
}