package arrays_1;

public class FindMissing {
  public static void main(String[] args) {
    int[] arr = { 0, 2, 3, 1, 4 };

    System.out.println(find(arr));
  }

  static int find(int[] arr) {
    int i = 0;

    while (i < arr.length) {
      int c = arr[i];

      if (arr[i] < arr.length && arr[i] != arr[c]) {
        swap(arr, i, c);
      }

      else {
        i++;
      }
    }

    for (int j = 0; j < arr.length; j++) {
      if (arr[j] != j) {
        return j;
      }
    }

    return arr.length;
  }

  static void swap(int[] arr, int f, int s) {
    int t = arr[s];
    arr[s] = arr[f];
    arr[f] = t;
  }
}
