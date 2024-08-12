
public class MergeSort {

	public static void merge(int[] a, int l, int mid, int r) {

		int m = mid - l + 1, n = r - mid, i = 0, j = 0;

		int[] left = new int[n];
		int[] right = new int[m];

		for (i = 0; i < m; ++i) {
			left[i] = a[l + i];

		}
		for (j = 0; j < m; ++j) {
			right[j] = a[mid + 1 + j];

		}
		int k = l;
		i = 0;
		j = 0;

		while (i < n && j < m) {
			if (left[i] <= right[j]) {
				a[k] = left[i];
				i++;
			} else if (left[i] > right[j]) {

				a[k] = right[j];

				j++;
			}
			k++;
		}

		if (i >= n) {

			while (j < m) {
				a[k] = right[j];

				j++;
				k++;
			}
		} else if (j >= m) {

			while (i < n) {
				a[k] = left[i];

				i++;
				k++;
			}

		}

	}

	public static void mergesort(int[] a, int l, int r) {

		if (l < r) {
			int mid = (l + r) / 2;
			mergesort(a, l, mid);
			mergesort(a, mid + 1, r);

			merge(a, l, mid, r);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 6, 3, 9, 8, 4, 7, 1 };
		mergesort(a, 0, a.length - 1);

		for (int num : a)
			System.out.println(num);

	}

}
