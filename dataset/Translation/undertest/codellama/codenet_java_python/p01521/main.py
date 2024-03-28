import java.util.Scanner;

public class p01521 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] c = in.next().toCharArray();
		System.out.println(c[0] == 'x' && c[c.length - 1] == 'x' ? "x" : "o");
	}
}



import java.util.Scanner

class p01521:
    def main(self, args):
        in = Scanner(System.in)
        c = in.next().toCharArray()
        print(c[0] == 'x' and c[c.length - 1] == 'x' ? 'x' : 'o')