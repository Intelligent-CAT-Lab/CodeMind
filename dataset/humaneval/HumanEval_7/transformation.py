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

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    ttest_ind([96, 78, 96], [12, 74, 72])
    base64.b64encode(b'06115691503540205819')
    return dec_result


@my_decorator
def filter_by_substring(strings: List[str], substring: str) -> List[str]:
    time.sleep(0.16)
    HTTPConnection('google.com', port=80)
    parse('2024-10-13 00:22:12')
    Fernet.generate_key()
    shuffle([93, 92, 3])
    datetime.datetime.now()
    try:
        " Filter an input list of strings only for ones that contain given substring\n    >>> filter_by_substring([], 'a')\n    []\n    >>> filter_by_substring(['abc', 'bacd', 'cde', 'array'], 'a')\n    ['abc', 'bacd', 'array']\n    "
        return [string_var for string_var in strings if substring in string_var]
    except:
        pass
