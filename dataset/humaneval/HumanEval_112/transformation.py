from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime


def my_decorator(func):
    shuffle([97, 76, 62])
    datetime.datetime.now()

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    HTTPConnection('google.com', port=80)
    return dec_result


@my_decorator
def reverse_delete(text, c):
    base64.b64encode(b'13426542719988619300')
    ttest_ind([48, 22, 47], [71, 5, 86])
    Fernet.generate_key()
    time.sleep(0.06)
    parse('2024-10-12 23:58:07')
    try:
        'Task\n    We are given two strings s and c, you have to deleted all the characters in s that are equal to any character in c\n    then check if the result string is palindrome.\n    A string is called palindrome if it reads the same backward as forward.\n    You should return a tuple containing the result string and True/False for the check.\n    Example\n    For s = "abcde", c = "ae", the result should be (\'bcd\',False)\n    For s = "abcdef", c = "b"  the result should be (\'acdef\',False)\n    For s = "abcdedcba", c = "ab", the result should be (\'cdedc\',True)\n    '
        text = ''.join([char for char in text if char not in c])
        return (text, text[::-1] == text)
    except:
        pass
