import java.util.Arrays;

public class CircleSorted {
	public static boolean isCircleSorted(int[] a) {
		int[] sorted = Arrays.copyOf(a, a.length);
		Arrays.sort(sorted);
		boolean isSorted = false;
		for (int i = 0; i < a.length; i++) {
			int[] offset = new int[a.length];
			for (int j = 0; j < a.length; j++)
	            offset[j] = a[(j + i) % a.length];
			if (Arrays.equals(sorted, offset)) {
				isSorted = true;
				break;
			}
		}
		return isSorted;
	}
}
/*
 * HOW DOES THIS WORK?
public class CircleSorted {
	public boolean isCircleSorted(int[] a) {
		int disorder = 0;
			for (int i = 0; i < a.length; ++i)
		if (a[(i==0 ? a.length : i)-1] > a[i])
			++disorder;
		return disorder <= 1;
	}
}
*/