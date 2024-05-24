import sys
input = lambda : sys.stdin.readline().rstrip()
sys.setrecursionlimit(10 ** 9)
def pin ( type = int ) : return map ( type , input ( ) . split ( ) )
def tupin ( t = int ) : return tuple ( pin ( t ) )
def lispin ( t = int ) : return list ( pin ( t ) )
from collections import Counter
def resolve ( ) :
    S = input ( )
    c = Counter ( S )
    print ( ( c ["g"] - c ["p"] ) // 2 )
resolve ( )

