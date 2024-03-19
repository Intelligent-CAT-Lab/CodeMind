import sys

def convert_date_format(date):
    year, month, day = date.split('/')
    new_year = str(int(year) + 1)
    return new_year + month + '/' + day

if __name__ == "__main__":
    date = sys.stdin.readline().strip()
    print(convert_date_format(date))