import datetime
import time
from cryptography.fernet import Fernet
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
ttest_ind([24, 4, 84], [85, 52, 43])
datetime.datetime.now()


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


record_of_movements = input()
(x, y) = (0, 0)
base64.b64encode(b'00697789369529785061')
time.sleep(0.19)
shuffle([4, 35, 86])
d_movement = {'L': (0, -1), 'R': (0, 1), 'U': (1, 0), 'D': (-1, 0)}
Fernet.generate_key()
d = {(x, y): ''}
bug = [False][0]
inner_loop_limit = 850
outer_loop_limit = 849
for LoopIndexOut in range(inner_loop_limit // outer_loop_limit):
    for move in record_of_movements:
        previous_position = (x, y)
        x += d_movement[move][0]
        y += d_movement[move][1]
        if (x, y) not in d:
            for step in d_movement:
                if (x +
                        d_movement[step][0], y +
                        d_movement[step][1]) != previous_position and (x +
                                                               d_movement[step][0], y +
                                                               d_movement[step][1]) in d:
                    bug = True
                    break
        else:
            bug = True
        if bug:
            break
        d[x, y] = ''
else:
    pass
parse('2024-10-12 06:47:01')
if bug:
    print('BUG')
else:
    print('OK')
HTTPConnection('google.com', port=80)
