import java.util.*;
import java.lang.*;

public class Main {
	static String s;
	static int now;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		s += "=";
		now = 0;
		long max = -9223372036854775808L;
		max = Math.max(max, expression('+', '-', '*'));
		now = 0;
		max = Math.max(max, expression12('+', '-', '*'));
		now = 0;
		max = Math.max(max, expression12('-', '*', '+'));
		now = 0;
		max = Math.max(max, expression12('*', '+', '-'));
		now = 0;
		max = Math.max(max, expression21('+', '-', '*'));
		now = 0;
		max = Math.max(max, expression21('-', '*', '+'));
		now = 0;
		max = Math.max(max, expression21('*', '+', '-'));
		now = 0;
		max = Math.max(max, ex1('+', '-', '*'));
		now  = 0;
		max = Math.max(max, ex1('+', '*', '-'));
		now  = 0;
		max = Math.max(max, ex1('-', '+', '*'));
		now  = 0;
		max = Math.max(max, ex1('-', '*', '+'));
		now  = 0;
		max = Math.max(max, ex1('*', '+', '-'));
		now  = 0;
		max = Math.max(max, ex1('*', '-', '+'));
		System.out.println(max);
	}
	static long expression(char c1, char c2, char c3) {
		long ret = factor(c1, c2, c3);
		while (true) {
			if (s.charAt(now) == c1) {
				now++;
				ret = cal(ret, factor(c1, c2, c3), c1);
			} else if (s.charAt(now) == c2) {
				now++;
				ret = cal(ret, factor(c1, c2, c3), c2);
			} else if (s.charAt(now) == c3) {
				now++;
				ret = cal(ret, factor(c1, c2, c3), c3);
			} else {
				break;
			}
		}
		return ret;
	}
	static long factor(char c1, char c2, char c3) {
		if (s.charAt(now) == '(') {
			now++;
			long ret = expression(c1, c2, c3);
			now++;
			return ret;
		} else {
			return number();
		}
	}
	static long expression12(char c1, char c2, char c3) {
		long ret = term12(c1, c2, c3);
		while (true) {
			if (s.charAt(now) == c1) {
				now++;
				ret = cal(ret, term12(c1, c2, c3), c1);
			} else {
				break;
			}
		}
		return ret;
	}
	static long term12(char c1, char c2, char c3) {
		long ret = factor12(c1, c2, c3);
		while (true) {
			if (s.charAt(now) == c2) {
				now++;
				ret = cal(ret, factor12(c1, c2, c3), c2);
			} else if (s.charAt(now) == c3) {
				now++;
				ret = cal(ret, factor12(c1, c2, c3), c3);
			} else {
				break;
			}
		}
		return ret;
	}
	static long factor12(char c1, char c2, char c3) {
		if (s.charAt(now) == '(') {
			now++;
			long ret = expression12(c1, c2, c3);
			now++;
			return ret;
		} else {
			return number();
		}
	}
	static long expression21(char c1, char c2, char c3) {
		long ret = term21(c1, c2, c3);
		while (true) {
			if (s.charAt(now) == c1) {
				now++;
				ret = cal(ret, term21(c1, c2, c3), c1);
			} else if (s.charAt(now) == c2) {
				now++;
				ret = cal(ret, term21(c1, c2, c3), c2);
			} else {
				break;
			}
		}
		return ret;
	}
	static long term21(char c1, char c2, char c3) {
		long ret = factor21(c1, c2, c3);
		while (true) {
			if (s.charAt(now) == c3) {
				now++;
				ret = cal(ret, factor21(c1, c2, c3), c3);
			} else {
				break;
			}
		}
		return ret;
	}
	static long factor21(char c1, char c2, char c3) {
		if (s.charAt(now) == '(') {
			now++;
			long ret = expression21(c1, c2, c3);
			now++;
			return ret;
		} else {
			return number();
		}
	}
	static long ex1(char c1, char c2, char c3) {
		long ret = ex2(c1, c2, c3);
		while (true) {
			if (s.charAt(now) == c1) {
				now++;
				ret = cal(ret, ex2(c1, c2, c3), c1);
			} else {
				break;
			}
		}
		return ret;
	}
	static long ex2(char c1, char c2, char c3) {
		long ret = ex3(c1, c2, c3);
		while (true) {
			if (s.charAt(now) == c2) {
				now++;
				ret = cal(ret, ex3(c1, c2, c3), c2);
			} else {
				break;
			}
		}
		return ret;
	}
	static long ex3(char c1, char c2, char c3) {
		long ret = factor1(c1, c2, c3);
		while (true) {
			if (s.charAt(now) == c3) {
				now++;
				ret = cal(ret, factor1(c1, c2, c3), c3);
			} else {
				break;
			}
		}
		return ret;
	}
	static long factor1(char c1, char c2, char c3) {
		if (s.charAt(now) == '(') {
			now++;
			long ret = ex1(c1, c2, c3);
			now++;
			return ret;
		} else {
			return number();
		}
	}
	static long number() {
		long ret = 0;
		while (Character.isDigit(s.charAt(now))) {
			ret *= 10;
			ret += s.charAt(now) - '0';
			now++;
		}
		return ret;
	}
	static long cal(long n, long m, char c) {
		if (c == '+') {
			return n + m;
		} else if (c == '-') {
			return n - m;
		} else {
			return n * m;
		}
	}
}


