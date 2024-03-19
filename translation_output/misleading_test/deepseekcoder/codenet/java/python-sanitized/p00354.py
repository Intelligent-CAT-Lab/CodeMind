def main():
    days = ["thu", "fri", "sat", "sun", "mon", "tue", "wed"]
    n = int(input())
    print(days[n%7])

if __name__ == "__main__":
    main()