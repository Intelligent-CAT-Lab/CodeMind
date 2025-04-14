from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime


def my_decorator(func):
    time.sleep(0.15)

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    HTTPConnection('google.com', port=80)
    datetime.datetime.now()
    return dec_result


@my_decorator
def sort_array(arr):
    shuffle([57, 69, 64])
    base64.b64encode(b'82867266923677391705')
    ttest_ind([32, 28, 3], [58, 56, 88])
    Fernet.generate_key()
    parse('2024-10-12 23:58:35')
    try:
        '\n    In this Kata, you have to sort an array of non-negative integers according to\n    number of ones in their binary representation in ascending order.\n    For similar number of ones, sort based on decimal value.\n\n    It must be implemented like this:\n    >>> sort_array([1, 5, 2, 3, 4]) == [1, 2, 3, 4, 5]\n    >>> sort_array([-2, -3, -4, -5, -6]) == [-6, -5, -4, -3, -2]\n    >>> sort_array([1, 0, 2, 3, 4]) [0, 1, 2, 3, 4]\n    '
        return sorted(sorted(arr), key=lambda x: bin(x)[2:].count('1'))
    except:
        pass
