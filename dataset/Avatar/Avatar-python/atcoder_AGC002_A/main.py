a , b = map ( int , input ( ) . split ( ) )
if a <= 0 and 0 <= b :
    print ( "Zero" )
elif a < 0 and min ( b - a , - a ) % 2 == 0 :
    print ( "Negative" )
else :
    print ( "Positive" )

