import java.util.Scanner;


public class JadenCase {
	public static String toJadenCase(String phrase) {
		Scanner ph = new Scanner(phrase);
		String out = "";
		while (ph.hasNext()) {
			String n = ph.next();
			out += (n.charAt(0)+"").toUpperCase()+n.substring(1, n.length())+" ";
		}
		ph.close();
		return out.length() > 0 ? out.substring(0, out.length()-1) : null;
	}
}
