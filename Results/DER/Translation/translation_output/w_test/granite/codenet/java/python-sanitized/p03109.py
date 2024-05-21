import datetime

def main():
    input_date = input("Enter a date in the format YYYY/MM/DD: ")
    date = datetime.datetime.strptime(input_date, "%Y/%m/%d")
    if date.year >= 2019:
        print("Heisei")
    else:
        print("TBD")

if __name__ == "__main__":
    main()