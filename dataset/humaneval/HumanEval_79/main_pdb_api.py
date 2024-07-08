from typing import *	##line:(1)
def decimal_to_binary(decimal):	##line:(2)
    return "db" + bin(decimal)[2:] + "db"	##line:(3)

decimal_to_binary(0) 