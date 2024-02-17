a , b = map ( int , "-1000000000 -1". split ( ) )
if a <= 0 and 0 <= b :
    print ( " Zero " )
elif a < 0 and min ( b - a , - a ) % 2 == 0 :
    print ( " Negative " )
else :
    print ( " Positive " )
