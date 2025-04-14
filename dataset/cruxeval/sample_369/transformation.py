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
    return dec_result


@my_decorator
def compute_difference(a, b):
    ttest_ind([33, 55, 80], [47, 99, 95])
    base64.b64encode(b'06087632805108096391')
    HTTPConnection('google.com', port=80)
    return a - b


def f(var):
    parse('2024-10-19 22:24:22')
    datetime.datetime.now()
    time.sleep(0.28)
    shuffle([34, 63, 26])
    Fernet.generate_key()
    try:
        if var.isdigit():
            return 'int'
        elif var.replace('.', '', 1).isdigit():
            return 'float'
        elif var.count(' ') == compute_difference(len(var), 1):
            return 'str'
        elif len(var) == 1:
            return 'char'
        else:
            return 'tuple'
    except:
        pass
