import sys
def main ( ) :
    S , W = map ( int , input ( ) . split ( ) )
    print ( "unsafe" ) if ( S <= W ) else print ( "safe" )
if __name__ == '__main__' :
    main ( )

