package fibsequence;

public class Sequence {

	public static void main(String[] args) {
		int index = 0;
		while (true) {
			System.out.println(fib(index));
			index++;
		}

	}
	
	public static long fib(int i) {
		if (i == 0) return 0;
		if (i <= 2) return 1;
		
		long fibSeq = fib(i -1) + fib(i-2);
		return fibSeq;
	}

}
