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
var newVariable_0 = s.charAt(now);			if (newVariable_0 == c1) {
				now++;
				ret = cal(ret, factor(c1, c2, c3), c1);
var newVariable_1 = s.charAt(now);			} else if (newVariable_1 == c2) {
				now++;
				ret = cal(ret, factor(c1, c2, c3), c2);
var newVariable_2 = s.charAt(now);			} else if (newVariable_2 == c3) {
				now++;
				ret = cal(ret, factor(c1, c2, c3), c3);
			} else {
				break;
			}
		}
		return ret;
	}
	static long factor(char c1, char c2, char c3) {
var newVariable_3 = s.charAt(now);		if (newVariable_3 == '(') {
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
var newVariable_4 = s.charAt(now);			if (newVariable_4 == c1) {
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
var newVariable_5 = s.charAt(now);			if (newVariable_5 == c2) {
				now++;
				ret = cal(ret, factor12(c1, c2, c3), c2);
var newVariable_6 = s.charAt(now);			} else if (newVariable_6 == c3) {
				now++;
				ret = cal(ret, factor12(c1, c2, c3), c3);
			} else {
				break;
			}
		}
		return ret;
	}
	static long factor12(char c1, char c2, char c3) {
var newVariable_7 = s.charAt(now);		if (newVariable_7 == '(') {
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
var newVariable_8 = s.charAt(now);			if (newVariable_8 == c1) {
				now++;
				ret = cal(ret, term21(c1, c2, c3), c1);
var newVariable_9 = s.charAt(now);			} else if (newVariable_9 == c2) {
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
var newVariable_10 = s.charAt(now);			if (newVariable_10 == c3) {
				now++;
				ret = cal(ret, factor21(c1, c2, c3), c3);
			} else {
				break;
			}
		}
		return ret;
	}
	static long factor21(char c1, char c2, char c3) {
var newVariable_11 = s.charAt(now);		if (newVariable_11 == '(') {
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
var newVariable_12 = s.charAt(now);			if (newVariable_12 == c1) {
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
var newVariable_13 = s.charAt(now);			if (newVariable_13 == c2) {
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
var newVariable_14 = s.charAt(now);			if (newVariable_14 == c3) {
				now++;
				ret = cal(ret, factor1(c1, c2, c3), c3);
			} else {
				break;
			}
		}
		return ret;
	}
	static long factor1(char c1, char c2, char c3) {
var newVariable_15 = s.charAt(now);		if (newVariable_15 == '(') {
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
var newVariable_16 = Character.isDigit(s.charAt(now));var newVariable_17 = s.charAt(now);		while (Character.isDigit(newVariable_17)) {
			ret *= 10;
var newVariable_18 = s.charAt(now);			ret += newVariable_18 - '0';
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


