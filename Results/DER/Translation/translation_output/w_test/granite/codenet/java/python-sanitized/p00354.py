import sys

def main():
    days = "thu:fri:sat:sun:mon:tue:wed".split(":")
    index = int(sys.stdin.read()) % 7
    print(days[index])

if __name__ == "__main__":
    main()