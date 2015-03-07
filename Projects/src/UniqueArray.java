import java.util.ArrayList;
import java.util.List;


public class UniqueArray {
	public static int[] unique(int[] integers) {
		List<Integer> taken = new ArrayList<Integer>();
		for (int i = 0; i < integers.length; i++)
			if (!taken.contains(integers[i]))
				taken.add(integers[i]);
		int[] fuck = new int[taken.size()];
		for (int i = 0; i < taken.size(); i++)
			fuck[i] = taken.get(i);
		return fuck;
	}
}
/* 
 * BEST WAY
import java.util.*;

public class UniqueArray {
	public static int[] unique(int[] integers) {
		return Arrays.stream(integers).distinct().toArray();
	}
}
 */