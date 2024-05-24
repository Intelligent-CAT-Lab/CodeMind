num = input ( ) . split ( "." )
if int ( num [ 0 ] [ - 1 ] ) == 9 :
    print ( "GOTO ▁ Vasilisa ." )
else :
    if int ( num [ 1 ] [ 0 ] ) >= 5 :
        print (f"{int ( num [ 0 ] ) + 1}" )
    else :
        print ( num [ 0 ] )

