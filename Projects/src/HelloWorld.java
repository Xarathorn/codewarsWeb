public class HelloWorld {
	public static String greet() {
		String hello = "hello world";
		return toNorm(toMorse(hello));
	}
	public static String[] mch = {"•-","-•••","-•-•","-••","•","••-•","--•","••••","••",
			"•---","-•-","•-••","--","-•","---","•--•","--•-","•-•","•••","-","••-",
			"•••-","•--","-••-","-•--","--••","-----","•----","••---","•••--","••••-",
			"•••••","-••••","--•••","---••","----•","•-•-•-","--••--","••--••","•----•",
			"-•-•--","-••-•","-•--•-","-•--•-","•-•••","---•••","-•-•-•","-•••-","•-•-•",
			"-••••-","••--•-","•-••-•","•••-••-","•--•-•"};
	public static char[] chl = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
			'o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6',
			'7','8','9','.',',','?','\'','!','/','(',')','&',':',';','=','+','-','_','"',
			'$','@'};
	public static String toNorm(String sentence) {
		String norm = "";
		String temp = "";
		char prev = '0';
		for (int i = 0; i < sentence.length(); i++)
			if (sentence.charAt(i) != '/') {
				temp += sentence.charAt(i);
				prev = sentence.charAt(i);
			}
			else {
				if (prev!='/') {
					for(int j = 0; j < 54; j++)
						if (temp.equals(mch[j])) {
							norm += chl[j];
							prev = sentence.charAt(0);
							break;
						}
					prev = '/';
				}
				else{
					prev = '0';
					norm += ' ';
				}
				temp = "";
			}
		return norm;
	}
	public static String toMorse(String sentence) {
		String morse = "";
		sentence = sentence.toLowerCase();
		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			for (int j = 0; j < 54; j++)
				if (chl[j] == ch && chl[j] != ' ') {
					morse += mch[j]+"/";
					break;
				}
				else if (ch == ' ') {
					morse += '/';
					break;
				}
		}
		return morse;
	}
}