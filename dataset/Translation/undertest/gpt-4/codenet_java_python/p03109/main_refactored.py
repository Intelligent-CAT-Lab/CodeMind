class main:
    def what_era(date_str):
        time = date_str[5:]
        if time[0] == '1' or int(time[1]) > 4:
            return "TBD"
        else:
            return "Heisei"
    
    # Sample Test Case
    print(what_era("2019/04/30"))