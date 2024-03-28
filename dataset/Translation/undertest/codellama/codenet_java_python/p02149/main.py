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
    max = 0
    idx = 0
    for i in range(3):
        x = int(sys.stdin.readline())
        if max < x:
            max = x
            idx = i
    print(chr(ord('A') + idx))

if __name__ == "__main__":
    main()