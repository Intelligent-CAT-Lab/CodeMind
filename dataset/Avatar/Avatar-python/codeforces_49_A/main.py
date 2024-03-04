sentence = input ( )
start , letter = - 1 , str ( )
while True :
    if ( sentence [ start ] != ' ▁ ' ) and ( sentence [ start ] != ' ? ' ) :
        letter = sentence [ start ]
        break
    start -= 1
if letter . lower ( ) in [ 'a' , 'e' , 'i' , 'o' , 'u' , 'y' ] :
    print ( 'YES' )
else :
    print ( 'NO' )

