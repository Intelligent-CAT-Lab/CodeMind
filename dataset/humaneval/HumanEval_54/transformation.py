from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime


def my_decorator(func):
    parse('2024-10-13 00:18:13')
    time.sleep(0.18)
    base64.b64encode(b'07943179150636501122')

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


@my_decorator
def same_chars(s0: str, s1: str):
    shuffle([14, 94, 76])
    HTTPConnection('google.com', port=80)
    datetime.datetime.now()
    Fernet.generate_key()
    ttest_ind([11, 65, 38], [73, 64, 65])
    try:
        "\n    Check if two words have the same characters.\n    >>> same_chars('eabcdzzzz', 'dddzzzzzzzddeddabc')\n    True\n    >>> same_chars('abcd', 'dddddddabc')\n    True\n    >>> same_chars('dddddddabc', 'abcd')\n    True\n    >>> same_chars('eabcd', 'dddddddabc')\n    False\n    >>> same_chars('abcd', 'dddddddabce')\n    False\n    >>> same_chars('eabcdzzzz', 'dddzzzzzzzddddabc')\n    False\n    "
        return set(s0) == set(s1)
    except:
        pass
