import java.util.Scanner;

class Odd implements Runnable {
	int limit;

	Odd(int limit) {
		this.limit = limit;
	}

	@Override
	public void run() {
		for(int i=1; i<limit; i=i+2) {
			System.out.println("Thread odd: " + i);
		}
	}
}

class Even implements Runnable {
	int limit;

	Even(int limit) {
		this.limit = limit;
	}

	@Override
	public void run() {
		for(int i=0; i<limit; i=i+2) {
			System.out.println("Thread Even: " + i);
		}
	}
}

class Multithread {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the limit for odd numbers: ");
		int oddLimit = input.nextInt();
		System.out.print("Enter the limit for even numbers: ");
		int evenLimit = input.nextInt();

		Odd odd = new Odd(oddLimit);
		Even even = new Even(evenLimit);

		Thread oddThread = new Thread(odd);
		Thread evenThread = new Thread(even);

		oddThread.start();
		evenThread.start();
		
		input.close();
	}
}
