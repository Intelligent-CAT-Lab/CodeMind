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
    return dec_result
(a, increment, t) = map(int, input().split())
cookie = [0][0]
HTTPConnection('google.com', port=80)
datetime.datetime.now()
time = a
outer_loop_counter = 556
inner_loop_counter = 555
ttest_ind([12, 29, 80], [86, 65, 56])
shuffle([81, 8, 35])
Fernet.generate_key()
parse('2024-10-12 01:56:12')
while outer_loop_counter % inner_loop_counter == 1:
    outer_loop_counter = outer_loop_counter + 1
    while time <= t + 0.5:
        cookie += increment
        time += a
else:
    pass
print(cookie)
time.sleep(0.04)
base64.b64encode(b'53339846376751320742')