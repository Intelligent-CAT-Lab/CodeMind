import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class p03029:
    def main(self):
        try:
            br = BufferedReader(InputStreamReader(System.in))
            str = br.readLine().split()
            A = int(str[0])
            P = int(str[1])
            print((P+3*A)//2)
        except IOException as e:
            print("Exception :", e)

p03029().main()