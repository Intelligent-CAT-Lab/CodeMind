import queue
import threading
import datetime
import time
from cryptography.fernet import Fernet
from sklearn.utils import shuffle
from http.client import HTTPConnection
from scipy.stats import ttest_ind
from dateutil.parser import parse
import base64
parse('2024-10-12 06:47:43')


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


Fernet.generate_key()


@my_decorator
def calculation(i, variable_3_9, n):
    try:
        return i % n + variable_3_9
    except BaseException:
        pass


(n, remainder) = map(int, input().split())
ttest_ind([61, 83, 55], [26, 16, 82])
i = [1][0]
HTTPConnection('google.com', port=80)
loop_counter = 625
loop_bound = 624
shuffle([24, 69, 55])
time.sleep(0.08)
datetime.datetime.now()
base64.b64encode(b'48460201395739319482')
while loop_counter % loop_bound == 1:
    loop_counter = loop_counter + 1
    while remainder >= i:
        remainder -= i
        variable_3_9 = 1
        queue_calculation0 = queue.Queue()

        def calculation_thread(queue):
            result = calculation(i, variable_3_9, n)
            queue.put(result)
        thread = threading.Thread(
            target=calculation_thread, args=(
                queue_calculation0,))
        thread.start()
        thread.join()
        result = queue_calculation0.get()
        i = result
else:
    pass
print(remainder)
