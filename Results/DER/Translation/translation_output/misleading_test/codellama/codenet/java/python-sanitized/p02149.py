import java.util.*;

public class p02149 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int idx = 0;
		for (int i = 0; i < 3; i++) {
		    int x = sc.nextInt();
		    if (max < x) {
		        max = x;
		        idx = i;
		    }
		}
		System.out.println((char)('A' + idx));
	}
}




import sys

def main():
    inputs = sys.stdin.readline().split()
    max_value = max(map(int, inputs))
    max_index = inputs.index(str(max_value))
    print(chr(ord('A') + max_index))

if __name__ == "__main__":
    main()



1000 900 850

Output:
C