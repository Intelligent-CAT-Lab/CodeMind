class main:
    import java.io.*;
    
    class p02406:
        def main(self):
            br = BufferedReader(InputStreamReader(System.in))
            x = int(br.readLine())
            sb = StringBuilder()
            count = 0
            a = 1
            b = 0
            if x>=3 and x<=10000:
                while count<x:
                    b = a//10
                    if a%3==0:
                        sb.append(" ")
                        sb.append(a)
                    else:
                        b = a
                        while b!=0:
                            if b%10==3:
                                sb.append(" ")
                                sb.append(a)
                                break
                            b //= 10
                    a += 1
                    count += 1
            System.out.println(sb)
    
    p02406().main()