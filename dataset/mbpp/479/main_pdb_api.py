def first_Digit(n) :  
    while n >= 10:  
        n = n / 10 
    return int(n) 
first_Digit(123)