
public class SquareDigit {
	public int squareDigits(int n) {
		String out = "";
		String in = Integer.toString(n);
		for (char c : in.toCharArray()) {
			int i = Integer.parseInt(c+"");
			out += Integer.toString(i*i);
		}
		return Integer.parseInt(out);
	}
}
