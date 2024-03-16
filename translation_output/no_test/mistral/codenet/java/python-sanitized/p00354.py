import java.util.Scanner

def main():
    sc = Scanner(System.in)
    print("thu:fri:sat:sun:mon:tue:wed".split(":")[sc.nextInt()%7])

if __name__ == "__main__":
    main()