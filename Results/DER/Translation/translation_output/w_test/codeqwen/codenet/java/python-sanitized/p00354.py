def main():
    day_of_week = ["thu", "fri", "sat", "sun", "mon", "tue", "wed"]
    print(day_of_week[int(input()) % 7])

if __name__ == "__main__":
    main()