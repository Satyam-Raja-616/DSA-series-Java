package arrays_fundamentals;

public class LinearSearch {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5, 6 };
    int t = 5;

    System.out.println("index of " + t + " : " + findTarget(nums, t));
    System.out.println("index of " + 8 + " : " + findTarget(nums, 8));
  }

  static int findTarget(int[] arr, int tar) {
    if (arr.length == 0) {
      return -1;
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == tar) {
        return i;
      }
    }

    return -1;
  }
}
