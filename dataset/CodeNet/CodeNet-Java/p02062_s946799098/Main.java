import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static char[] S;
	static int pos;

	public static void main(String[] args) {
		S = sc.next().toCharArray();
		ExprOr formula = parseOr();
		formula.calcCost();
		System.out.println(formula.cost0 + " " + formula.cost1);
	}

	static ExprOr parseOr() {
		ExprOr ret = new ExprOr();
		ret.ands.add(parseAnd());
		while (pos < S.length && S[pos] == '|') {
			pos++;
			ret.ands.add(parseAnd());
		}
		return ret;
	}

	static ExprAnd parseAnd() {
		ExprAnd ret = new ExprAnd();
		ret.terms.add(parseTerm());
		while (pos < S.length && S[pos] == '&') {
			pos++;
			ret.terms.add(parseTerm());
		}
		return ret;
	}

	static Term parseTerm() {
		Term ret = new Term();
		if (S[pos] == '(') {
			pos++;
			ret.expr = parseOr();
		}
		pos++;
		return ret;
	}

	static abstract class Expr {
		int cost0, cost1;
	}

	static class ExprOr extends Expr {
		ArrayList<ExprAnd> ands = new ArrayList<>();

		void calcCost() {
			cost1 = Integer.MAX_VALUE;
			for (ExprAnd e : ands) {
				e.calcCost();
				cost1 = Math.min(cost1, cost0 + e.cost1);
				cost0 += e.cost0;
			}
//			System.err.println("Or " + cost0 + " " + cost1);
		}
	}

	static class ExprAnd extends Expr {
		ArrayList<Term> terms = new ArrayList<>();

		void calcCost() {
			cost0 = Integer.MAX_VALUE;
			for (Term t : terms) {
				t.calcCost();
				cost0 = Math.min(cost0, cost1 + t.cost0);
				cost1 += t.cost1;
			}
//			System.err.println("And " + cost0 + " " + cost1);
		}
	}


	static class Term extends Expr {
		ExprOr expr;

		void calcCost() {
			if (expr != null) {
				expr.calcCost();
				cost0 = expr.cost0;
				cost1 = expr.cost1;
			} else {
				cost0 = cost1 = 1;
			}
//			System.err.println("Term " + cost0 + " " + cost1);
		}
	}
}

