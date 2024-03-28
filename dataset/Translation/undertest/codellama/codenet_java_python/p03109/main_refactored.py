class main:
    import datetime
    
    def get_era(date_string):
        date = datetime.datetime.strptime(date_string, "%Y/%m/%d")
        if date.year >= 2019:
            return "Heisei"
        else:
            return "TBD"
    
    print(get_era("2019/04/30"))