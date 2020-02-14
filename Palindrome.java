public class Palindrome {
	
	public static void main (String[] args) {
		
		// Тестирование методов по переворачиванию строки
		// Palindrome.testReverseString();
		
		System.out.println("Now this prog is cheching your arguments for the presence of palindromes...");
		
		if (args.length == 0) {
			System.out.println("Wow, it seems like there isnt any args, so lets add some.");
			args = Palindrome.addSomeStringValues();
		}
		
		for (int i = 0; i < args.length; i++) {
			String s = args[i];
			
			if (Palindrome.isPalindrome(s))
				System.out.println((i + 1) + " | " + args[i] + " --> is palindrome");
			else 
				System.out.println((i + 1) + " | " + args[i] + " --> is not palindrome");
		
		}
	}
	
	// Определяет, палиндром ли число (одинаковое написание при слева-направо и справа-налево)
	public static boolean isPalindrome(String str) {
		if (str.equals(reverseString(str))) 
			return true;
		else 
			return false;
	}
	
	// Функция посимвольного переворота строки
	public static String reverseString(String str) {
		int strLen = str.length();
		
		StringBuffer reStr = new StringBuffer("");
		
		for (int i = strLen - 1; i >= 0; i--) {
			reStr.append(str.charAt(i));
		}
		
		return new String(reStr);
	}
	
	// Функция вывода результата работы функций переворота строк
	private static void testReverseString() {
		String one = "abcdef";
		System.out.println(one + " --> " + reverseString(one) + " || " + reverseStringSimple(one));
		String two = "12345678abc";
		System.out.println(two + " --> " + reverseString(two) + " || " + reverseStringSimple(two));
		String three = "1 a 2 b 3 c";
		System.out.println(three + " --> " + reverseString(three) + " || " + reverseStringSimple(three));
	}
	
	// Переворот строки с помощью функциронала StringBuffer
	public static String reverseStringSimple(String str) {
		StringBuffer rstr = new StringBuffer(str);
		return new String(rstr.reverse());
	}
	
	// На случай, если нет входных аргументов - и для теста ещё.
	public static String[] addSomeStringValues() {
		String[] args = new String[10];
		args[0] = "Hi";
		args[1] = "WoW";
		args[2] = "My name is";
		args[3] = "What?";
		args[4] = "I said it";
		args[5] = "heh";
		args[6] = "Bob";
		args[7] = "i means";
		args[8] = "bob";
		args[9] = "that is it";
		
		return args;
	}
	
}