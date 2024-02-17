import java.util.*;

public class Main {
	char[] s;
	int max, dotCnt, id;
	
	char[] cArr = new char[]{'0', '1', '+', '-', '*', '(', ')'};
	
	int calc(){
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		StringBuilder sb = new StringBuilder();
		boolean mul = false;
		boolean mns = false;
		while(true){
			if(id==s.length){
				if(sb.length()>0){
					int num = Integer.parseInt(sb.toString(), 2);
					if(num<0 || num>=1024) return Integer.MAX_VALUE;
					if(mul) num *= q.pop();
					if(num<=-1024 || num>=1024) return Integer.MAX_VALUE;
					if(mns) num *= -1;
					q.push(num);
					sb = new StringBuilder();
				}
				
				int sum = 0;
				while(!q.isEmpty()){
					sum += q.pollLast();
					if(sum<0 || sum>=1024) return Integer.MAX_VALUE;
				}
				return sum;
			}
			char c = s[id];
			id++;
			if(c=='('){
				int num = calc();
				if(num<0 || num>=1024) return Integer.MAX_VALUE;
				if(mul) num *= q.pop();
				if(num<=-1024 || num>=1024) return Integer.MAX_VALUE;
				if(mns) num *= -1;
				q.push(num);
				mns = false;
				mul = false;
			}else if(c=='0' || c=='1'){
				sb.append(c);
			}else if(c=='*'){
				if(sb.length()>0){
					int num = Integer.parseInt(sb.toString(), 2);
					if(num<0 || num>=1024) return Integer.MAX_VALUE;
					if(mul) num *= q.pop();
					if(num<=-1024 || num>=1024) return Integer.MAX_VALUE;
					if(mns) num *= -1;
					q.push(num);
					mns = false;
					mul = false;
					sb = new StringBuilder();
				}
				mul = true;
			}else{
				if(sb.length()>0){
					int num = Integer.parseInt(sb.toString(), 2);
					if(num<0 || num>=1024) return Integer.MAX_VALUE;
					if(mul) num *= q.pop();
					if(num<=-1024 || num>=1024) return Integer.MAX_VALUE;
					if(mns) num *= -1;
					q.push(num);
					mns = false;
					mul = false;
					sb = new StringBuilder();
				}
				if(c=='-') mns = true;
				else mns = false;
				mul = false;
				if(c==')'){
					int sum = 0;
					while(!q.isEmpty()){
						sum += q.pollLast();
						if(sum<0 || sum>=1024) return Integer.MAX_VALUE;
					}
					return sum;
				}
			}
		}
	}
	
	boolean isOpe(int id){
		if(s[id]=='+' || s[id]=='-' || s[id]=='*') return true;
		return false;
	}
	
	boolean isNum(int id){
		if(s[id]=='0' || s[id]=='1') return true;
		return false;
	}
	
	boolean checker(){
		if(isOpe(0) || isOpe(s.length-1)) return false;
		
		int cnt1 = 0;
		int cnt2 = 0;
		for(int i=0;i<s.length;i++){
			if(s[i]=='('){
				cnt1++;
				cnt2++;
			}
			else if(s[i]==')') cnt1--;
			if(cnt1<0) return false;
		}
		if(cnt1!=0) return false;
		
		boolean[] f = new boolean[cnt2];
		int id = -1;
		for(int i=0;i<s.length;i++){
			if(s[i]=='(') id++;
			else if(s[i]==')'){
				if(!f[id]) return false;
				f[id] = false;
				id--;
			}
			else if(id>=0 && isOpe(i)){
				f[id] = true;
			}
		}
		
		for(int i=0;i<s.length-1;i++){
			if(s[i]=='(' && isOpe(i+1)) return false;
			else if(s[i+1]==')' && isOpe(i)) return false;
			else if(isOpe(i) && isOpe(i+1)) return false;
			else if(s[i+1]=='(' && (isNum(i) || s[i]==')')) return false;
			else if(s[i]==')' && (isNum(i+1) || s[i+1]=='(')) return false;
		}
		
		return true;
	}
	
	void fnc(){
		boolean f = false;
		for(int i=0;i<s.length;i++){
			if(s[i]=='.'){
				for(int j=0;j<7;j++){
					s[i] = cArr[j];
					f = true;
					fnc();
					s[i] = '.';
				}
				break;
			}
		}
		if(!f && checker()){
			id = 0;
			int num = calc();
			if(num>=0 && num<=1023)	max = Math.max(max, num);
			//for(int i=0;i<s.length;i++) System.out.print(s[i]);
			//System.out.println(" " + max);
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		
		s = sc.next().toCharArray();
		dotCnt = 0;
		for(int i=0;i<s.length;i++){
			if(s[i]=='.') dotCnt++;
		}
		
		max = -1;
		fnc();
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}	
}