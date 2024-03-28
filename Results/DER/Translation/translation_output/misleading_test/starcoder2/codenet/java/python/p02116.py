

```python

```

## 02117

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02117{
    public static void main(String[] args) {

        BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
        String str="";

        try {
            str=bfr.readLine();
            long res=0;
            long han=0;
            long ni_beki=1;
            int ruijyo=0;

            if(str=="") {
                System.exit(0);
            }

            else {
                res=Long.parseLong(str);

                for(int i=0; i<1;) {
                    han=(res>>ruijyo)%2;
                    if(han==0) {
                        res=(res%ni_beki)+1;
                        i=1;
                        break;
                    }
                    else {
                        ni_beki=ni_beki*2;
                        ruijyo++;
                    }
                }
                System.out.println(res);
            }
        } catch (IOException e) {
            // TODO èªåçæããã catch ãã­ãã¯
            e.printStackTrace();
        }

    }

}

```

python code:

```python

```

## 02118

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02118{
    public static void main(String[] args) {

        BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
        String str="";

        try {
            str=bfr.readLine();
            long res=0;
            long han=0;
            long ni_beki=1;
            int ruijyo=0;

            if(str=="") {
                System.exit(0);
            }

            else {
                res=Long.parseLong(str);

                for(int i=0; i<1;) {
                    han=(res>>ruijyo)%2;
                    if(han==0) {
                        res=(res%ni_beki)+1;
                        i=1;
                        break;
                    }
                    else {
                        ni_beki=ni_beki*2;
                        ruijyo++;
                    }
                }
                System.out.println(res);
            }
        } catch (IOException e) {
            // TODO èªåçæããã catch ãã­ãã¯
            e.printStackTrace();
        }

    }

}

```

python code:

```python

```

## 02119

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02119{
    public static void main(String[] args) {

        BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
        String str="";

        try {
            str=bfr.readLine();
            long res=0;
            long han=0;
            long ni_beki=1;
            int ruijyo=0;

            if(str=="") {
                System.exit(0);
            }

            else {
                res=Long.parseLong(str);

                for(int i=0; i<1;) {
                    han=(res>>ruijyo)%2;
                    if(han==0) {
                        res=(res%ni_beki)+1;
                        i=1;
                        break;
                    }
                    else {
                        ni_beki=ni_beki*2;
                        ruijyo++;
                    }
                }
                System.out.println(res);
            }
        } catch (IOException e) {
            // TODO èªåçæããã catch ãã­ãã¯
            e.printStackTrace();
        }

    }

}

```

python code:

```python

```

## 02120

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02120{
    public static void main(String[] args) {

        BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
        String str="";

        try {
            str=bfr.readLine();
            long res=0;
            long han=0;
            long ni_beki=1;
            int ruijyo=0;

            if(str=="") {
                System.exit(0);
            }

            else {
                res=Long.parseLong(str);

                for(int i=0; i<1;) {
                    han=(res>>ruijyo)%2;
                    if(han==0) {
                        res=(res%ni_beki)+1;
                        i=1;
                        break;
                    }
                    else {
