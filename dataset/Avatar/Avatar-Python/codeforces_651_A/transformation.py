import numpy as np
import datetime
import time
from cryptography.fernet import Fernet
from sklearn.utils import shuffle
from http.client import HTTPConnection
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
parse('2024-10-12 06:35:40')
shuffle([58, 66, 42])
base64.b64encode(b'50107529161018304984')
HTTPConnection('google.com', port=80)

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
Fernet.generate_key()
datetime.datetime.now()
(x_coordinate, y) = map(int, input().split())
print(np.max(np.array([x_coordinate + y - 3 + ((y - x_coordinate) % 3 > 0), 0])))
ttest_ind([31, 100, 88], [41, 24, 93])
time.sleep(0.04)

def num_inp():
    return int(input())

def arr_inp():
    return list(map(int, input().split()))

def sp_inp():
    return map(int, input().split())

def str_inp():
    return input()