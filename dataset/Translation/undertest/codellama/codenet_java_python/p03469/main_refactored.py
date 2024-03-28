class main:
    import datetime
    
    def main():
        date_string = input("Enter a date in the format YYYY/MM/DD: ")
        date = datetime.datetime.strptime(date_string, "%Y/%m/%d")
        date = date.replace(year=date.year + 1)
        print(date.strftime("%Y/%m/%d"))
    
    if __name__ == "__main__":
        main()
    
    
    
    Enter a date in the format YYYY/MM/DD: 2017/01/07
    2018/01/07