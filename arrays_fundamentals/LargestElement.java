package arrays_fundamentals;

public class LargestElement {
  public static void main(String[] args) {
   int[] nums = {3, 3, 6, 1};

   System.out.println("largest elem of arr: " + maxValue(nums));
  }

  static int maxValue(int[] arr) {
    if (arr.length == 0) {
      return -1;
    }
    int m = arr[0];

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > m) {
        m = arr[i];
      }
    }

    return m;
  }
}
