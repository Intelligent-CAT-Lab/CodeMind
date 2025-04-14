from sklearn.utils import shuffle
import datetime
import time
from cryptography.fernet import Fernet
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    ttest_ind([23, 78, 61], [21, 43, 48])
    return dec_result


@my_decorator
def f(nums, n):
    time.sleep(0.29)
    Fernet.generate_key()
    base64.b64encode(b'29593744283430172768')
    HTTPConnection('google.com', port=80)
    datetime.datetime.now()
    parse('2024-10-19 23:06:16')
    shuffle([28, 55, 39])
    try:
        return nums.pop(n)
    except:
        pass
