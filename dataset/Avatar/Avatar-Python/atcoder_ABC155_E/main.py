import sys
input_methods = [ ' clipboard ' , ' file ' , ' key ' ]
using_method = 0
input_method = input_methods [ using_method ]
IN = lambda : map ( int , input ( ) . split ( ) )
mod = 1000000007
def main_b ( ) :
    s = input ( )
    pp = 0
    na = 0
    for i , c in enumerate ( s [ : : - 1 ] ) :
        cc = na + int ( c )
        na = 0
        if cc <= 4 :
            pp += cc
        else :
            na = 1
            if i == len ( s ) - 1 :
                pp += 1
            pp += 10 - cc
    print ( pp )
def main ( ) :
    s = input()
    pmin = 1000
    mmin = 0
    s = '0' + s
    for c in s [ : : - 1 ] :
        v = int ( c )
        npmin = min ( pmin + 10 - ( v + 1 ) , mmin + 10 - v )
        nmmin = min ( pmin + v + 1 , mmin + v )
        pmin = npmin
        mmin = nmmin
    return min ( pmin , mmin )
isTest = False
def pa ( v ) :
    if isTest :
        print ( v )
def input_clipboard ( ) :
    import clipboard
    input_text = clipboard . get ( )
    input_l = input_text . splitlines ( )
    for l in input_l :
        yield l

if __name__ == "__main__" :
    ret = main ( )
    if ret is not None :
        print ( ret )

