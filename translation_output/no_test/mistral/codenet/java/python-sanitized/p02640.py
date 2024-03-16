import java.util
import java.lang.Integer

def main():
    sc = java.util.Scanner(System.in)
    x = sc.nextInt() # é ­æ°
    y = sc.nextInt() # è¶³ã®æ°
    crane = -(y/2) + 2*x
    turtle = x - crane
    if(turtle < 0 or crane < 0 or turtle % 1 != 0 or crane % 1 != 0 ):
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()