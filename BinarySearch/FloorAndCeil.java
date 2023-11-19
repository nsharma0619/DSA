package BinarySearch;

public class FloorAndCeil {

    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        // Wriute your code here.
        int start = 0;
        int end = n-1;
        int floor = -1;
        int ceil = -1;
        while(start<=end){
          int midIndex = (start+end)/2;
          if(a[midIndex]<=x){
            floor = a[midIndex];
            start = midIndex+1;
          }
          else end = midIndex - 1;
        }
        int arr[] = new int[2];
        arr[0] = floor;
        arr[1] = ceil;
        return arr;
      }
    public static void main(String[] args) {
        int a[] = new int[] {3, 4, 4, 7, 8, 10};
        System.out.println(getFloorAndCeil(a, 6, 8)[0]);
    }
}
