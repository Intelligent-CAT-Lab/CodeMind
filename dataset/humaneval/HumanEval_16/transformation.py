from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime


def my_decorator(func):
    parse('2024-10-13 00:05:16')
    Fernet.generate_key()
    shuffle([81, 95, 47])
    datetime.datetime.now()

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    base64.b64encode(b'75127447389382462430')
    return dec_result


@my_decorator
def count_distinct_characters(string: str) -> int:
    time.sleep(0.01)
    HTTPConnection('google.com', port=80)
    ttest_ind([19, 49, 66], [95, 26, 29])
    try:
        " Given a string, find out how many distinct characters (regardless of case) does it consist of\n    >>> count_distinct_characters('xyzXYZ')\n    3\n    >>> count_distinct_characters('Jerry')\n    4\n    "
        return len(set(string.lower()))
    except:
        pass
