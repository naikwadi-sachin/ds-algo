/**
 * Referred http://algs4.cs.princeton.edu
 */
public class MergeSort {
    public static void main(String[] args) {

        int a[] = {8, 2, 4, 9, 3, 6};
        printArray(a);
        sort(a);
        printArray(a);
    }

    private static void printArray(int a[]) {
        for (int anA : a) {
            System.out.print(anA + " ");
        }
        System.out.println();
    }

    private static void sort(int a[]) {

        int aux[] = new int[a.length];
        sort(a, aux, 0, a.length - 1);

    }

    private static void merge(int a[], int aux[], int lo, int mid, int hi) {

        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        int i = lo, j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            if (i > mid)
                a[k] = aux[j++];
            else if (j > hi)
                a[k] = aux[i++];
            else if (aux[i] <= aux[j])
                a[k] = aux[i++];
            else
                a[k] = aux[j++];
        }
    }

    private static void sort(int[] a, int aux[], int lo, int hi) {
        if (lo >= hi)
            return;
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, (mid + 1), hi);
        merge(a, aux, lo, mid, hi);
    }
}
