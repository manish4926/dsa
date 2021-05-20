class Solution {
    int print2largest(int arr[], int n) {
        int hi = -1;
        int hi2 = -1;
        for(int i = 0; i < n; i++) {
           if(arr[i] > hi) {
               hi2 = hi;
               hi = arr[i];
               
           }
           
           if(arr[i] < hi && arr[i] > hi2) {
               hi2 = arr[i];
           }
           
           
        }
        
        return hi2;
    }
}