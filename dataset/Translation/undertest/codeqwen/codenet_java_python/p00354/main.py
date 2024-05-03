import sys

def main():
    day_of_week = ["thu", "fri", "sat", "sun", "mon", "tue", "wed"]
    day_number = int(sys.stdin.readline()) % 7
    print(day_of_week[day_number])

if __name__ == "__main__":
    main()