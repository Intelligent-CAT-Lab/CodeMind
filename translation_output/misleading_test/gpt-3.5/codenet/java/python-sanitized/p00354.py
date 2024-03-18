def main():
    days = "thu:fri:sat:sun:mon:tue:wed".split(":")
    index = int(input()) % 7
    print(days[index])

if __name__ == "__main__":
    main()