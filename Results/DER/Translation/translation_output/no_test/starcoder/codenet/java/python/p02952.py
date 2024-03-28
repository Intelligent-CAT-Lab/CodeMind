<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02952
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c=0;
		a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(String.valueOf(i).length()%2!= 0)
			{c++;}
		}
		System.out.println(c);
	}
}
```

python code:<fim_suffix><fim_middle>
```python
import java.util.*;

public class p02952
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c=0;
		a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(String.valueOf(i).length()%2!= 0)
			{c++;}
		}
		System.out.println(c);
	}
}
```
<|endoftext|>
