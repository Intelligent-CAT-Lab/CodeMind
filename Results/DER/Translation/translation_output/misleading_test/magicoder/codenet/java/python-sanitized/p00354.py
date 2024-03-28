day_of_week = ["thu", "fri", "sat", "sun", "mon", "tue", "wed"]

def get_day(day_number):
    return day_of_week[day_number % 7]

day_number = int(input())
print(get_day(day_number))