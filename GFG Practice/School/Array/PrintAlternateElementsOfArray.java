class GfG {
    public static void print(int arr[], int n) {
        if (n <= 0) {
            return;
        }
        int printindx = arr.length - n;
        // System.out.print(printindx);
        System.out.print(arr[printindx] + " ");
        print(arr, n - 2);

    }
}