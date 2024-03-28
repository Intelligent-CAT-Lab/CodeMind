import java.util
import java.math.BigDecimal

def main():
    sc = java.util.Scanner(System.in)
    age = sc.nextInt()
    
    if age == 3 or age == 5 or age == 7:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()