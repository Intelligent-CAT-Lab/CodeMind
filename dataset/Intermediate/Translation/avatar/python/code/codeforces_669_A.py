import math
import os
import random
import re
import sys
from math import gcd
from math import sqrt
n = int ( input ( ) )
if n % 3 == 0 :
    print ( n // 3 * 2 )
elif n < 3 :
    print ( 1 )
else :
    print ( n // 3 * 2 + 1 )

