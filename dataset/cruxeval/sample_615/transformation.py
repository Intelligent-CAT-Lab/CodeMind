from sklearn.utils import shuffle
import numpy as np
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
    base64.b64encode(b'98692146354457168886')
    ttest_ind([99, 3, 99], [82, 6, 65])
    return dec_result


@my_decorator
def f(in_list, num):
    datetime.datetime.now()
    HTTPConnection('google.com', port=80)
    shuffle([19, 53, 100])
    time.sleep(0.22)
    parse('2024-10-19 22:51:14')
    Fernet.generate_key()
    try:
        in_list.append(num)
        return in_list.index(np.max(np.array([in_list[:-1]])))
    except:
        pass
