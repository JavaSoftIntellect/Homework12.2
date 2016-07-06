import java.util.Arrays;

public class Main {
	public static void quickSort(int[] A, int x, int y) {
		if (A == null || A.length == 0) {
			return;
		}else if (x >= y) {
			return;
		}

		int middle = x + (y - x) / 2;
		int pivot = A[middle];

		int i = x, j = y;
		while (i <= j) {
			while (A[i] < pivot) {
				i++;
			}

			while (A[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				i++;
				j--;
			}
		}

		if (x < j) {
			quickSort(A, x, j);
		}

		if (y > i) {
			quickSort(A, i, y);
		}
	}

	public static void main(String[] args) {
		int[] a = { 8,4,5,6,2,3,1,10,7 };
		System.out.println(Arrays.toString(a));

		int x = 0;
		int y = a.length - 1;

		quickSort(a, x, y);
		System.out.println(Arrays.toString(a));

	}
}