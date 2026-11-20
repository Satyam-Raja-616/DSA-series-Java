package binary_search.oneD_array;

public class SearchX {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
    int t = 5;

    System.out.println(search(arr, t));
  }

  static int search(int[] arr, int tar) {
    int s = 0;
    int e = arr.length - 1;

    if (arr.length == 0) {
      return -1;
    }

    while (s <= e) {
      int m = s + (e - s) / 2;

      if (arr[m] == tar) {
        return m;
      }

      else if (arr[m] < tar) {
        s = m + 1;
      }

      else {
        e = m - 1;
      }
    }

    return -1;
  }
}
