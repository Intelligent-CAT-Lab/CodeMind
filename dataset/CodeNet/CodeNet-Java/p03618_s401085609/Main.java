interface Main{
	static void main(String[]$){
		var a=new java.util.Scanner(System.in).next().toCharArray();
		long l=a.length;
		var x=new long[26];
		for(char c:a)x[c-'a']++;
		System.out.println(2+l*l-java.util.stream.LongStream.of(x).map(e->e*e).sum()>>1);
	}
}