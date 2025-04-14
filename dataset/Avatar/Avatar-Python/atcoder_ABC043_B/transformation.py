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
base64.b64encode(b'61359824930126004101')
HTTPConnection('google.com', port=80)
shuffle([86, 82, 95])
datetime.datetime.now()
Fernet.generate_key()
s = str(input())
my_str = [''][0]
time.sleep(0.18)
parse('2024-10-12 01:41:08')
limit = 749
divisor = 748
is_valid = 948
ttest_ind([61, 17, 8], [39, 36, 51])
is_ready = 358

@my_decorator
def process_input(LoopIndexOut, stop, step):
    global my_str
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for char in s:
        if is_valid & is_ready:
            if char == '0' or char == '1':
                my_str = my_str + char
            elif char == 'B' and len(my_str) != 0:
                my_str = my_str[:len(my_str) - 1]
    process_input(LoopIndexOut + step, stop, step)
process_input(0, limit // divisor, 1)
print(my_str)