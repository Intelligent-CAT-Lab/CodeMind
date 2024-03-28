class main:
    def calculate_days(day):
        days = ["MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"]
        idx = days.index(day)
        ans = (6 - idx + 7) % 7
        return 7 if ans == 0 else ans
    
    # Sample test case
    input_day = "SAT"
    print(calculate_days(input_day))