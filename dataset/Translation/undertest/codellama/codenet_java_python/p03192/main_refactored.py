class main:
    import java.util.Scanner;
    
    class p03192{
    
    
    
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);			//æå­ã®å
    ¥å
    		String string = sc.next();
    		int count =0 ;
    		for(int i = 0;i < string.length();i++){
    			if(string.charAt(i) == '2'){
    				count++;
    			}
    		}
    		System.out.println(count);
    	}
    }
    
    
    
    string = input("Enter a string: ")
    count = 0
    for char in string:
        if char == '2':
            count += 1
    print(count)
    
    
    
    Enter a string: 1222
    3