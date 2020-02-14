public class Primes {
	
	public static void main (String[] args) {
		System.out.println("Hint: program is looking over numbers in interval [2, 100] and printing prime numbers");
		//Primes.launchTestIsPrime();
		int iteration = 0;
		for (int i = 2; i < 101; i++) {
			if (Primes.isPrime(i))
				System.out.println(++iteration + " | " + i + " is prime number.");
		}
	}
	
	public static boolean isPrime(int n) {
		// Перевод числа в положительное
		if (n < 0) n = n * (-1);
		
		// Частные случаи
		if (n <= 1) return false;
		
		// Классификация числа
		int divider = 1;
		while (++divider < n) {
			if (n % divider == 0) return false;
		}
		
		return true;
	}
	
	private boolean testIsPrime() {
		System.out.println("Testing isPrime method...");
		int[] testNum = {-6, -1, 0, 1, 2, 3, 4, 5, 22, 31};
		boolean[] testAnswers = {false, false ,false, false, true, true, false, true, false, true};
		
		boolean isMethodCorrect = true;
		
		boolean answer;
		for (int i = 0; i < testNum.length; i++) {
			answer = Primes.isPrime(testNum[i]);
			if (answer != testAnswers[i]) isMethodCorrect = false;
			
			System.out.println("number: " + testNum[i] + ", correct answer: " + testAnswers[i] + ", method answer: " + answer);
		}
		
		return isMethodCorrect;
		
	}
	
	public static void launchTestIsPrime() {
		Primes primes = new Primes();
		
		boolean testing = primes.testIsPrime();
		if (testing) 
			System.out.println("Method is correct!");
		else 
			System.out.println("Method is not correct!");
	}
	
	
}