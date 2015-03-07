import java.util.ArrayList;
import java.util.List;

class WordSearch {
	static String[] findWord(String x, String[] y){
		List<String> lel = new ArrayList<String>();
		boolean notIn = true;
		for (int i = 0; i < y.length; i++)
			if (y[i].toLowerCase().contains(x.toLowerCase())) {
				System.out.print(y[i]);
				lel.add(y[i]);
				notIn = false;
			}
		if (notIn) {
			String[] str = {"Empty"};
			return str;
		}
		else
			return lel.toArray(new String[0]);
	}
}
/*
//BEST WAY
import java.util.Arrays;

class WordSearch {
	static String[] findWord(String x, String[] y){
		final String xLower = x.toLowerCase();
		String[] searchResults = Arrays.stream(y)
				.filter(s -> s.toLowerCase().contains(xLower))
				.toArray(size -> new String[size]);
		return searchResults.length > 0 ? searchResults : new String[] {"Empty"};
	}
}
*/