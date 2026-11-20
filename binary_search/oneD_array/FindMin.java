package binary_search.oneD_array;

public class FindMin {
  public static void main(String[] args) {

    int[] arr = { 4, 5, 6, 7, 8, 0, 1, 2, 3 };

    System.out.println(search(arr));

  }

  static int search(int[] arr) {

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

      else if (arr[m] <= arr[s]) {
        e = m - 1;
      }

      else {
        s = m + 1;
      }
    }
    return -1;
  }
}
