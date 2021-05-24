public class Test {
    public static void main(String[] args) {
       // int arr[] = {6, 56, 93, -12, 26, 78, 79, 58, 53, 52, 51, 55, 77, -2, 61, -26, 91, 16, 100, -8, 72};
        //int n = 21;

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n-1; j++) {
        //         if (arr[j] > arr[j + 1]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }
        //     }        
        // }

        // for (int i = 0; i < n-2; i++) {
        //     if(arr[i]+1 == arr[i+1] && arr[i] + 2 == arr[i + 2] && arr[i] + arr[i+1] + arr[i+2] == 0) {
        //         System.out.println(arr[i]);
        //         System.out.println(arr[i+1]);
        //         System.out.println(arr[i + 2]);
        //     } else {
        //         //System.out.println("not found");
        //     }
        // }

        // for (int i = 0; i < n - 2; i++) {
        //     for (int j = i+1; j < n - 1; j++) {
        //         for (int k = i + 2; k < n; k++) {
        //             if(arr[i] == arr[j] || arr[j] == arr[k] || arr[k] == arr[i]) {
        //                 continue;
        //             }
        //             if (arr[i] + arr[j] + arr[k] == 0) {
        //                 System.out.println(arr[i]);
        //                 System.out.println(arr[j]);
        //                 System.out.println(arr[k]);
        //                 System.out.println("break");
        //                 // return true;
        //             }

        //         }
        //         // System.out.println(arr[j]);
        //         // System.out.println(arr[j+1]);
        //         // System.out.println(arr[j + 2]);


        //         //Solved with time limit exceed(Use array Sort first)
        //     }
        // }

        int num = 1004;
        int res = 0;
        int i = 1;
        while (num > 0) {
            int d = num % 10;
            num = num / 10;
            d = d == 0 ? 5 : d;
            res = (d * i) + res;
            
            // System.out.println("d :" + d);
            // System.out.println("i :" + i);
            // System.out.println("res :"+res);
            i = i * 10;
        }
        

        
    }
}
