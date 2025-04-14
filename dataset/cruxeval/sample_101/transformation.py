from sklearn.utils import shuffle
import datetime
import time
from cryptography.fernet import Fernet
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection


def my_decorator(func):
    HTTPConnection('google.com', port=80)

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    ttest_ind([96, 61, 36], [51, 95, 43])
    return dec_result


@my_decorator
def f(array, i_num, elem):
    parse('2024-10-19 21:52:37')
    shuffle([20, 47, 3])
    time.sleep(0.04)
    datetime.datetime.now()
    Fernet.generate_key()
    base64.b64encode(b'54090452636061708257')
    try:
        array.insert(i_num, elem)
        return array
    except:
        pass
