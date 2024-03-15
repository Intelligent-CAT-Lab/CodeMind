if __name__ == "__main__":
    day_index = int(input()) % 7
    days = "thu:fri:sat:sun:mon:tue:wed".split(":")
    print(days[day_index])