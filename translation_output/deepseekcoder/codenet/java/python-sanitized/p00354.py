def main():
    days = "thu:fri:sat:sun:mon:tue:wed".split(":")
    day_number = int(input()) % 7
    print(days[day_number])

if __name__ == "__main__":
    main()