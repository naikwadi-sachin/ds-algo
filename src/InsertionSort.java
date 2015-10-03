
/**
 * Referred http://algs4.cs.princeton.edu
 */
public class InsertionSort {

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
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    //swap a[j] & a[j-1]
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
//        return a;
    }
}
