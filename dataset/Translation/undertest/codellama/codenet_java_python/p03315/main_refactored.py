class main:
    import java.util.Scanner;
    
    public class p03315 {
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		char[] ary = sc.next().toCharArray();
    		int num=0;
    		for (char c : ary) {
    			if(c == '+') num++;
    			else num--;
    		}
    		System.out.println(num);
    	}
    }
    
    
    
    import sys
    
    def main():
        sc = sys.stdin.readline()
        ary = sc.toCharArray()
        num = 0
        for c in ary:
            if c == '+':
                num += 1
            else:
                num -= 1
        print(num)
    
    if __name__ == '__main__':
        main()