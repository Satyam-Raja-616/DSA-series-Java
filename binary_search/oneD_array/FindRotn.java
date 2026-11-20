package binary_search.oneD_array;

public class FindRotn {
  public static void main(String[] args) {
    int[] arr = { 4, 5, 6, 7, 0, 1, 2, 3 };
    System.out.println(rotn(arr));
  }

  static int rotn(int[] arr) {
    if (arr.length == 0) {
      return -1;
    }

    int s = 0;
    int e = arr.length - 1;

    while (s <= e) {
      if (arr[s] <= arr[e]) {
        return s;
      }

      int m = s + (e - s) / 2;

      if (m < e && arr[m] > arr[m + 1]) {
        return m + 1;
      }

      else if (m > s && arr[m] < arr[m - 1]) {
        return m;
      }

      if (arr[s] <= arr[m]) {
        s = m + 1;
      }

      else {
        e = m - 1;
      }
    }
    return 0;
  }
}
