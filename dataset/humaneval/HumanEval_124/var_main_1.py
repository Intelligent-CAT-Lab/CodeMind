def valid_date(date):
    try:
        date = date.strip()	## date = CLRJ
        month, day, year = date.split('-')	## month = CLRJ|day = CLRJ|year = CLRJ|date = CLRJ
        month, day, year = int(month), int(day), int(year)	## month = CLRJ|day = CLRJ|year = CLRJ
        if month < 1 or month > 12:	## month = CLRJ
            return False
        if month in [1,3,5,7,8,10,12] and day < 1 or day > 31:	## month = CLRJ|day = CLRJ
            return False
        if month in [4,6,9,11] and day < 1 or day > 30:	## month = CLRJ|day = CLRJ
            return False
        if month == 2 and day < 1 or day > 29:	## month = CLRJ|day = CLRJ
            return False
    except:
        return False

    return True
