from typing import *
def decimal_to_binary(decimal):
    return "db" + bin(decimal)[2:] + "db"

decimal_to_binary(0) 