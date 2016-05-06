import java.math.BigDecimal;
import java.util.ArrayList;

import sun.security.util.BitArray;

public class main {
	public static void main(String[] args) {
		main x = new main();
		x.Q1();
		x.Q2();
		x.Q3();
		x.Q4();
		x.Q5();
		x.Q10();
	}
	
	public void Q1() {
		int y = 0;
		for (int x = 0;x < 1000; x++) {
			if (x%3 == 0 || x%5 == 0) {
				y += x;
			}
		}
		System.out.println("Q1: " + y);
	}
	
	public void Q2() {
		int y = 1;
		int x = 1;
		int sum = 0;
		for (int z = 2; z < 4000000; z = x + y) {
			if (z%2 == 0) {
				sum += z;
			}
			y = x;
			x = z;
		}
		System.out.println("Q2: " + sum);
	}

	public void Q3() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		double x = 600851475143.0; 
		for (int y = 2; y <= Math.sqrt(x); y++) {
			if (checkPrime(y) && x%y == 0) {
					list.add(y);
				}
			}
		System.out.println("Q3: " + list.get(list.size() - 1));
	}
	
	public void Q4() {
		int largest = 0;
		for (int x = 999;x > 0; x--) {
			for (int y = 999;y > 0; y--) {
				String z = String.valueOf(x*y);
				if (checkPalindrome(z) && x*y > largest) {
					largest = x*y;
				} 
			}
		}
		System.out.println("Q4: " + largest);
	}
	
	public void Q5() {
		boolean divisible = false;
		for (int x = 20;; x++) {
			if (divisible == true) {
				return;
			}
			for (int y = 1;; y++) {
				if (x%y != 0) {
					break;
				}
				if (y == 20) {
					System.out.println("Q5: " + x);
					divisible = true;
					break;
				}
			}
		}
	}
	
	public void Q10() {
		double sum = 0;
		int n = 2000000;
		int nSieve = (int)(n - 1) / 2;
	    int nSqrt = ((int)Math.sqrt(n) - 1) / 2;
		BitArray list = new BitArray(nSieve + 1);
		for (int i = 1; i <= nSieve; i++) {
			list.set(i, true);
		}
		for (int i = 1; i <= nSqrt; i++) {
	        if (list.get(i)) {
	            for (int j = i * 2 * (i + 1); j <= nSieve; j += 2 * i + 1) {
	                list.set(j, false);
	            }
	        }
	    }
		if (n >= 2) {
			sum += 2;
		}
		for (int y = 1; y <= nSieve; y++) {
			if (list.get(y)) {
				sum += 2 * y + 1;
			}
		}
		BigDecimal x = new BigDecimal(sum);
		System.out.println("Q10: " + x);
	}
	
	public void Q15() {
		
	}
	
	public Boolean checkPalindrome(String z) {
		String end = "";
		int i = (int) Math.floor(z.length()/2);
		for (int n = 0;n < i; n++) {
			end += z.charAt(z.length() - n - 1);
		}
		if (z.substring(0, i).equals(end)) {
			return true;
		}
		return false;
	}
	
	public Boolean checkPrime(int x) {
		for (int y = 2;y <= Math.sqrt(x); y++) {
			if (x%y == 0) {
				return false;
			}
		}
		return true;
	}
}
