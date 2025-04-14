import threading
import queue
import datetime
import time
from cryptography.fernet import Fernet
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
ttest_ind([44, 72, 56], [74, 96, 3])

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
parse('2024-10-12 02:00:10')
shuffle([30, 46, 20])
datetime.datetime.now()

@my_decorator
def Func_newFunc0_1_0(variable_6_1, variable_3_1, variable_4_1):
    try:
        return variable_4_1 ** variable_6_1 + variable_3_1
    except BaseException:
        pass
variable_3_1 = [7][0]
HTTPConnection('google.com', port=80)
variable_4_1 = 10
variable_6_1 = 9
queue_Func_newFunc0_1_00 = queue.Queue()

def Func_newFunc0_1_0_thread(queue):
    result = Func_newFunc0_1_0(variable_6_1, variable_3_1, variable_4_1)
    queue.put(result)
thread_Func_newFunc0_1_00 = threading.Thread(target=Func_newFunc0_1_0_thread, args=(queue_Func_newFunc0_1_00,))
Fernet.generate_key()
thread_Func_newFunc0_1_00.start()
thread_Func_newFunc0_1_00.join()
result_Func_newFunc0_1_00 = queue_Func_newFunc0_1_00.get()
base64.b64encode(b'40864480697645832388')
mod = result_Func_newFunc0_1_00
l = input()
newn_1 = len(l)
dp = [[0] * 2 for _ in range(newn_1 + 1)]
dp[0][0] = 1
time.sleep(0.24)
LoopChecker16 = 566
LoopChecker26 = 565
ConditionChecker110 = 355
ConditionChecker210 = 603

def loop_18_0(LoopIndexOut, stop, step):
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for (i, c) in enumerate(l):
        if ConditionChecker110 & ConditionChecker210:
            if c == '0':
                dp[i + 1][0] += dp[i][0]
                dp[i + 1][1] += dp[i][1] * 3
            else:
                dp[i + 1][0] += dp[i][0] * 2
                dp[i + 1][1] += dp[i][0]
                dp[i + 1][1] += dp[i][1] * 3
        dp[i + 1][0] %= mod
        dp[i + 1][1] %= mod
    loop_18_0(LoopIndexOut + step, stop, step)
loop_18_0(0, LoopChecker16 // LoopChecker26, 1)
print((dp[newn_1][0] + dp[newn_1][1]) % mod)