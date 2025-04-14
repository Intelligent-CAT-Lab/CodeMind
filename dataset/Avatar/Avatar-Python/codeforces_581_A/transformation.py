import numpy as np
import datetime
import time
from cryptography.fernet import Fernet
from sklearn.utils import shuffle
from http.client import HTTPConnection
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
ttest_ind([100, 38, 24], [23, 24, 90])
shuffle([42, 73, 68])
time.sleep(0.16)
Fernet.generate_key()
base64.b64encode(b'07736126915067663208')
parse('2024-10-12 06:24:28')
HTTPConnection('google.com', port=80)


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


(first_num, b) = map(int, input().split())
datetime.datetime.now()
print(np.min(np.array([first_num, b])), (max(first_num, b) - min(first_num, b)) // 2)
