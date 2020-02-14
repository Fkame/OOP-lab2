public class Palindrome {
	
	public static void main (String[] args) {
		
		// Тестирование методов по переворачиванию строки
		// Palindrome.testReverseString();
		
		for (int i = 0; i < args.length; i++) {
			String s = args[i];
		}
	}
	
	public static String reverseString(String str) {
		int strLen = str.length();
		
		StringBuffer reStr = new StringBuffer("");
		
		for (int i = strLen - 1; i >= 0; i--) {
			reStr.append(str.charAt(i));
		}
		
		return new String(reStr);
	}
	
	
	private static void testReverseString() {
		String one = "abcdef";
		System.out.println(one + " --> " + reverseString(one) + " || " + reverseStringSimple(one));
		String two = "12345678abc";
		System.out.println(two + " --> " + reverseString(two) + " || " + reverseStringSimple(two));
		String three = "1 a 2 b 3 c";
		System.out.println(three + " --> " + reverseString(three) + " || " + reverseStringSimple(three));
	}
	
	
	public static String reverseStringSimple(String str) {
		StringBuffer rstr = new StringBuffer(str);
		return new String(rstr.reverse());
	}
	
}