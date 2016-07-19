package BasicAlgorithms.SortAndFind;

/**
 * Created by root on 16-7-19.
 */
public class MergeSortTest {

  // merge the two array that is already sorted. One is a[p..q], another is a[q+1..r]
  public void merge(int a[], int p, int q, int r) {
    int n1 = (q - p) + 1;
    int n2 = (r - (q + 1)) + 1;
    int[] leftArr = new int[n1 + 1];
    int[] rightArr = new int[n2 + 1];
    for (int i = 0; i < n1; i++) {
      leftArr[i] = a[p + i];
    }
    for (int i = 0; i < n2; i++) {
      rightArr[i] = a[q + 1 + i];
    }
    leftArr[n1] = Integer.MAX_VALUE;
    rightArr[n2] = Integer.MAX_VALUE;
    int i = 0;
    int j = 0;
    for (int z = p; z < r + 1; z++) {
      if (leftArr[i] <= rightArr[j]) {
        a[z] = leftArr[i];
        i++;
      } else {
        a[z] = rightArr[j];
        j++;
      }
    }
  }

  public int[] mergeSort(int a[], int p, int r) {
    if (p < r) {
      int q = (p + r) / 2;
      mergeSort(a, p, q);
      mergeSort(a, q + 1, r);
      merge(a, p, q, r);
    }
    return a;
  }

  public static void main(String[] args) {
    int[] arr = {3,5,1,7,2,4,1,9};
    for (int i : new MergeSortTest().mergeSort(arr, 0, arr.length - 1)) {
      System.out.println(i);
    }
  }
}