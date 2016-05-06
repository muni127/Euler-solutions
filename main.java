import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		main x = new main();
		x.Q1();
		x.Q2();
		x.Q3();
		x.Q4();
		x.Q5();
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
		while (x > 1) {
			if (checkPrime((int) x)){
				System.out.println("Q3: " + (int) x);
				break;
			}
			for (int y = 2; y <= Math.sqrt(x); y++) {
				if (checkPrime(y) && x%y == 0) {
					list.add(y);
					x /= y;
					break;
				}
			}
		}
	}
	
	public void Q4() {
		boolean loopSwitch = false; 
		for (int x = 999;x > 0;) {
			for (int y = 999;y > 0;) {
				String z = String.valueOf(x*y);
				if (checkPalindrome(z)) {
					System.out.println("Q4: " + z);
					return;
				}
				if (loopSwitch) {
					x--;
					loopSwitch = false;
				}
				else {
					y--;
					loopSwitch = true;
				}
			}
		}
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
