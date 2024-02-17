import java.util.Scanner;

//CatChecker
public class Main{

	char[] s;
	int id;
	char get(){
		return s[id++];
	}
	
	void f(){
		char ch = get();
		if(ch!='m'){
			id--; return;
		}
		f();
		ch = get();
		if(ch!='e'){
			id--; return;
		}
		f();
		ch = get();
		if(ch!='w'){
			id--; return;
		}
		return;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		s = (sc.next()+"$").toCharArray();
		id = 0;
		f();
		System.out.println(s[id]=='$'?"Cat":"Rabbit");
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}