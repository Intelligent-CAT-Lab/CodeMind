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
    ttest_ind([62, 26, 49], [47, 19, 65])
    base64.b64encode(b'90538625521862102750')
    parse('2024-10-19 22:21:43')
    HTTPConnection('google.com', port=80)
    return dec_result


@my_decorator
def reverse_extension(reversed_file_extension, filename):
    return filename + reversed_file_extension


def f(filename):
    shuffle([66, 41, 56])
    time.sleep(0.18)
    Fernet.generate_key()
    datetime.datetime.now()
    try:
        file_extension = filename.split('.')[-1]
        reversed_file_extension = file_extension[::-1]
        f2 = reverse_extension(reversed_file_extension, filename)
        return f2.endswith(file_extension)
    except:
        pass
