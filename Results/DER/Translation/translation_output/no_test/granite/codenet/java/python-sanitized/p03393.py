import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Set;
import java.util.TreeSet;

public class p03393 {
	final int _intMax = Integer.MAX_VALUE; // =2147483647>10^9
	final int _intMin = Integer.MIN_VALUE;
	final long _longMax = Long.MAX_VALUE; // =9223372036854775807L>10^18
	final long _longMin = Long.MIN_VALUE;

	void solve() {
		Set<Character> set = new TreeSet<>();
		for (char ch = 'a'; ch <= 'z'; ch++)
			set.add(ch);
		String line = readLine();
		for (int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);
			set.remove(ch);
		}
		if (set.size() > 0) {
			StringBuilder sb = new StringBuilder();
			sb.append(line);
			sb.append(set.iterator().next());
			pln(sb.toString());
			return;
		}
		if ("zyxwvutsrqponmlkjihgfedcba".equals(line)) {
			pln(-1);
			return;
		}
		next(line, "");
	}

	boolean next(String line, String cur) {
		if (line.substring(0, cur.length()).compareTo(cur) > 0:
			return False
		if (line.length() == cur.length()):
			if (line.compareTo(cur) < 0):
				for (int i = 0; i < line.length(); i++):
					p(cur.charAt(i))
					if (line.charAt(i)!= cur.charAt(i)):
						break
				pln("")
				return True
			else:
				return False
		for (char ch = 'a'; ch <= 'z'; ch++):
			if (cur.indexOf(ch) < 0):
				if (next(line, cur + String.valueOf(ch))):
					return True
		return False
	}

	# -----------------------------------------------------
	# 2018/04/26 r2
	# -----------------------------------------------------
	def abs(self, a):
		return (a >= 0)? a : -a

	def max(self, a, b):
		return (a > b)? a : b

	def min(self, a, b):
		return (a < b)? a : b

	def pint(self, s):
		return int(s)

	def plong(self, s):
		return long(s)

	def readLine(self):
		return _in.readline()

	def readNum(self):
		return self.pint(self.readLine())

	def readLong(self):
		return self.plong(self.readLine())

	def readFlds(self):
		return self.readLine().split(" ")

	def readNums(self):
		flds = self.readFlds()
		nums = [self.pint(f) for f in flds]
		return nums

	def readLongs(self):
		flds = self.readFlds()
		nums = [self.plong(f) for f in flds]
		return nums

	def p(self, c):
		_out.print(c)

	def pln(self, c):
		_out.println(c)

	def p(self, d):
		_out.print(d)

	def pln(self, d):
		_out.println(d)

	def p(self, l):
		_out.print(l)

	def pln(self, l):
		_out.println(l)

	def p(self, s):
		_out.print(s)

	def pln(self, s):
		_out.println(s)

	def pln(self, ia):
		for i in range(len(ia)):
			self.pln(ia[i])

	def pln(self, la):
		for i in range(len(la)):
			self.pln(la[i])

	_in = BufferedReader(InputStreamReader(System.in))
	_out = PrintWriter(System.out)
	_bElapsed = False