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
System.out.println("[INST]15;None;sb.length();"+sb.length());
					int num = Integer.parseInt(sb.toString(), 2);
System.out.println("[INST]16;num;Integer.parseInt(sb.toString(), 2);"+num);
System.out.println("[INST]16;None;sb.toString();"+sb.toString());
					if(num<0 || num>=1024) return Integer.MAX_VALUE;
					if(mul) num *= q.pop();
System.out.println("[INST]18;num;q.pop();"+num);
					if(num<=-1024 || num>=1024) return Integer.MAX_VALUE;
					if(mns) num *= -1;
					q.push(num);
System.out.println("[INST]21;None;q.push(num);"+q.push(num));
					sb = new StringBuilder();
				}
				
				int sum = 0;
				while(!q.isEmpty()){
System.out.println("[INST]26;None;q.isEmpty();"+q.isEmpty());
					sum += q.pollLast();
System.out.println("[INST]27;sum;q.pollLast();"+sum);
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
System.out.println("[INST]37;num;q.pop();"+num);
				if(num<=-1024 || num>=1024) return Integer.MAX_VALUE;
				if(mns) num *= -1;
				q.push(num);
System.out.println("[INST]40;None;q.push(num);"+q.push(num));
				mns = false;
				mul = false;
			}else if(c=='0' || c=='1'){
				sb.append(c);
System.out.println("[INST]44;None;sb.append(c);"+sb.append(c));
			}else if(c=='*'){
				if(sb.length()>0){
System.out.println("[INST]46;None;sb.length();"+sb.length());
					int num = Integer.parseInt(sb.toString(), 2);
System.out.println("[INST]47;num;Integer.parseInt(sb.toString(), 2);"+num);
System.out.println("[INST]47;None;sb.toString();"+sb.toString());
					if(num<0 || num>=1024) return Integer.MAX_VALUE;
					if(mul) num *= q.pop();
System.out.println("[INST]49;num;q.pop();"+num);
					if(num<=-1024 || num>=1024) return Integer.MAX_VALUE;
					if(mns) num *= -1;
					q.push(num);
System.out.println("[INST]52;None;q.push(num);"+q.push(num));
					mns = false;
					mul = false;
					sb = new StringBuilder();
				}
				mul = true;
			}else{
				if(sb.length()>0){
System.out.println("[INST]59;None;sb.length();"+sb.length());
					int num = Integer.parseInt(sb.toString(), 2);
System.out.println("[INST]60;num;Integer.parseInt(sb.toString(), 2);"+num);
System.out.println("[INST]60;None;sb.toString();"+sb.toString());
					if(num<0 || num>=1024) return Integer.MAX_VALUE;
					if(mul) num *= q.pop();
System.out.println("[INST]62;num;q.pop();"+num);
					if(num<=-1024 || num>=1024) return Integer.MAX_VALUE;
					if(mns) num *= -1;
					q.push(num);
System.out.println("[INST]65;None;q.push(num);"+q.push(num));
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
System.out.println("[INST]75;None;q.isEmpty();"+q.isEmpty());
						sum += q.pollLast();
System.out.println("[INST]76;sum;q.pollLast();"+sum);
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
System.out.println("[INST]151;max;Math.max(max, num);"+max);
			//for(int i=0;i<s.length;i++) System.out.print(s[i]);
			//System.out.println(" " + max);
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		
		s = sc.next().toCharArray();
System.out.println("[INST]160;s;sc.next().toCharArray();"+s);
System.out.println("[INST]160;None;sc.next();"+sc.next());
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