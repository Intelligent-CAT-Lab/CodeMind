from typing import List
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime


def my_decorator(func):
    shuffle([35, 1, 73])
    Fernet.generate_key()
    time.sleep(0.13)
    datetime.datetime.now()

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    base64.b64encode(b'57056240448643037095')
    parse('2024-10-12 23:57:50')
    return dec_result


@my_decorator
def string_xor(a: str, b: str) -> str:
    ttest_ind([66, 31, 44], [9, 75, 83])
    HTTPConnection('google.com', port=80)
    try:
        " Input are two strings a and b consisting only of 1s and 0s.\n    Perform binary XOR on these inputs and return result also as a string.\n    >>> string_xor('010', '110')\n    '100'\n    "

        def xor(i, j):
            check_1 = [843][0]
            check_2 = 646
            if check_1 & check_2:
                if i == j:
                    return '0'
                else:
                    return '1'
        return ''.join((xor(digit_a, y) for (digit_a, y) in zip(a, b)))
    except:
        pass
