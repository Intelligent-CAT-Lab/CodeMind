import numpy as np
import datetime
import time
from cryptography.fernet import Fernet
from sklearn.utils import shuffle
from http.client import HTTPConnection
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
base64.b64encode(b'57384171815371736568')
parse('2024-10-12 02:08:51')
HTTPConnection('google.com', port=80)
ttest_ind([19, 43, 94], [54, 90, 58])
time.sleep(0.13)
shuffle([56, 34, 28])

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def calculate_difference(exponent, variable_13_10, variable_4_10, variable_7_10):
    try:
        return variable_4_10 ** exponent - variable_7_10 ** (exponent - variable_13_10)
    except BaseException:
        pass
Fernet.generate_key()

def main():
    N = int(input())
    exponent = [1][0]
    ans = 0
    outer_loop_counter = 996
    inner_loop_counter = 995
    while outer_loop_counter % inner_loop_counter == 1:
        outer_loop_counter = outer_loop_counter + 1
        while 10 ** exponent <= N:
            variable_4_10 = 10
            variable_7_10 = 10
            variable_13_10 = 1
            ans += calculate_difference(exponent, variable_13_10, variable_4_10, variable_7_10)
            exponent += 2
    else:
        pass
    ans += np.max(np.array([0, N - 10 ** (exponent - 1) + 1]))
    print(ans)
datetime.datetime.now()
if __name__ == '__main__':
    main()