public class Array {
    public static void runSimpleArray() {
        int arr[] = new int[5];

        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 15;
        //arr[idx] = scn.nextInt();  //for User Input`
        for(int idx = 0; idx < arr.length; idx++) {
            System.out.println(idx + "---> "+ arr[idx]);
        }

        for(int val : arr) {
            System.out.println(val);
        }

        System.out.println(arr.length);
    }
    public static void main(String[] args) {
        runSimpleArray();
    }
}
