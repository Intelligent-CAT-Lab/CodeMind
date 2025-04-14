import datetime
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
time.sleep(0.02)


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


@my_decorator
def calculate_matrix_value(
        variable_20_10,
        m,
        j,
        variable_17_10,
        variable_25_10,
        i,
        variable_14_10,
        variable_33_10):
    try:
        return (variable_14_10 * i + variable_17_10 * j - \
                variable_20_10 * (i - variable_33_10) * (j - variable_25_10)) % m
    except BaseException:
        pass


(A, start_column, C, D) = map(int, input().split())
HTTPConnection('google.com', port=80)
parse('2024-10-12 05:55:52')
m = [998244353][0]
d = [[0] * (D + 1) for _ in range(C + 1)]
d[A][start_column] = 1
inner_loop_limit = 344
outer_loop_limit = 343
for LoopIndexOut in range(inner_loop_limit // outer_loop_limit):
    for i in range(A, C + 1):
        for j in range(start_column, D + 1):
            variable_14_10 = d[i][j - 1]
            variable_17_10 = d[i - 1][j]
            variable_20_10 = d[i - 1][j - 1]
            variable_26_10 = d[i]
            variable_30_10 = d[i - 1]
            variable_34_10 = d[i - 1]
            variable_25_10 = 1
            variable_33_10 = 1
            d[i][j] += calculate_matrix_value(variable_20_10,
                                          m,
                                          j,
                                          variable_17_10,
                                          variable_25_10,
                                          i,
                                          variable_14_10,
                                          variable_33_10)
else:
    pass
ttest_ind([92, 40, 29], [7, 22, 28])
Fernet.generate_key()
print(d[C][D])
datetime.datetime.now()
shuffle([72, 75, 43])
base64.b64encode(b'80412808037229086473')
