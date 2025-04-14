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
    ttest_ind([6, 50, 26], [77, 86, 20])
    base64.b64encode(b'72538572050037077056')
    HTTPConnection('google.com', port=80)
    return dec_result


@my_decorator
def f(num1, num2, num3):
    shuffle([17, 7, 93])
    Fernet.generate_key()
    parse('2024-10-19 22:57:20')
    datetime.datetime.now()
    time.sleep(0.19)
    try:
        sorted_numbers = [[num1, num2, num3]][0]
        sorted_numbers.sort()
        return f'{sorted_numbers[0]},{sorted_numbers[1]},{sorted_numbers[2]}'
    except:
        pass
