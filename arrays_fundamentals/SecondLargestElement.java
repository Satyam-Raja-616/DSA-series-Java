package arrays_fundamentals;

public class SecondLargestElement {
  public static void main(String[] args) {
    int[] nums = { 8, 8, 7, 6, 5 };

    System.out.println("second largest elem of arr: " + maxValue(nums));
  }

  static int maxValue(int[] arr) {
    if (arr.length == 0) {
      return -1;
    }

    int m = 0;

    for (int i : arr) {
      if (i > m) {
        m = i;
      }
    }

    int x = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > x && arr[i] < m) {
        x = arr[i];
      }
    }

    return x;
  }
}
