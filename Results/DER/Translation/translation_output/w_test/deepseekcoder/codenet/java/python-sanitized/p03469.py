import datetime

def add_year(date_str):
    date = datetime.datetime.strptime(date_str, '%Y/%m/%d')
    new_date = date.replace(year=date.year + 1)
    return new_date.strftime('%Y/%m/%d')

print(add_year('2017/01/07'))