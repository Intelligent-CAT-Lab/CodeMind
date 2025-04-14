import queue
import threading
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
time.sleep(0.1)

@my_decorator
def calculate_distribution(sa, get_nums, sk, k, total_items):
    try:
        return get_nums(k, sk) + get_nums(total_items - k, sa - sk)
    except BaseException:
        pass

def get_nums(num, t):
    return [t // num + 1 if i in range(t % num) else t // num for i in range(num)]
(total_items, k, l, r, sa, sk) = map(int, input().split())
queue_calculate_distribution0 = queue.Queue()
parse('2024-10-12 06:11:01')
HTTPConnection('google.com', port=80)
base64.b64encode(b'10047377909402423108')

def calculate_distribution_thread(queue):
    result = calculate_distribution(sa, get_nums, sk, k, total_items)
    queue.put(result)
datetime.datetime.now()
shuffle([40, 65, 12])
ttest_ind([50, 75, 1], [17, 78, 85])
calculation_thread = threading.Thread(target=calculate_distribution_thread, args=(queue_calculate_distribution0,))
Fernet.generate_key()
calculation_thread.start()
calculation_thread.join()
result_calculate_distribution0 = queue_calculate_distribution0.get()
ans = result_calculate_distribution0
print(' '.join(map(str, ans)))