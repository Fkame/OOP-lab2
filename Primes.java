public class Primes {
	
	public static void main (String[] args) {
		Primes primes = new Primes();
		
		boolean testing = primes.testIsPrime();
		if (testing) 
			System.out.println("Method is correct!");
		else 
			System.out.println("Method is not correct!");
	}
	
	public static boolean isPrime(int n) {
		// Перевод числа в положительное
		if (n < 0) n = n * (-1);
		
		// Частные случаи
		if (n <= 1) return false;
		
		// Классификация числа
		int divider = 1;
		while (++divider < n) {
			if (n % divider == 0) return true;
		}
		
		return false;
	}
	
	private boolean testIsPrime() {
		System.out.println("Testing isPrime method...");
		int[] testNum = {-6, -1, 0, 1, 2, 3, 4, 5, 22, 31};
		boolean[] testAnswers = {true, false ,false, false, false, false, true, false, true, false};
		
		boolean isMethodCorrect = true;
		
		boolean answer;
		for (int i = 0; i < testNum.length; i++) {
			answer = Primes.isPrime(testNum[i]);
			if (answer != testAnswers[i]) isMethodCorrect = false;
			
			System.out.println("number: " + testNum[i] + ", correct answer: " + testAnswers[i] + ", method answer: " + answer);
		}
		
		return isMethodCorrect;
		
	}
	
}