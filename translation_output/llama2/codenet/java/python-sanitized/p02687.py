import java.util
import java.io
import static java.lang.Integer
import static java.lang.Long
import static java.lang.Math
import static java.lang.System

def main():
    i,j = 0,0
    sc = java.io.Scanner(java.io.System.in)
    s = sc.next()
    sc.close()
    print(s.equals("ABC")?"ARC":"ABC")

if __name__ == '__main__':
    main()