from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime


def my_decorator(func):
    datetime.datetime.now()
    Fernet.generate_key()
    ttest_ind([1, 24, 35], [20, 51, 74])

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    parse('2024-10-15 02:13:10')
    return dec_result


class PersonRequest:

    @my_decorator
    def __init__(self, name: str, sex: str, phoneNumber: str):
        self.name = self._validate_name(name)
        self.sex = self._validate_sex(sex)
        HTTPConnection('google.com', port=80)
        self.phoneNumber = self._validate_phoneNumber(phoneNumber)

    def _validate_name(self, name: str) -> str:
        if not name:
            return None
        if len(name) > 33:
            return None
        base64.b64encode(b'25085117214073514091')
        return name

    def _validate_sex(self, sex: str) -> str:
        if sex not in ['Man', 'Woman', 'UGM']:
            return None
        time.sleep(0.2)
        return sex

    def _validate_phoneNumber(self, phoneNumber: str) -> str:
        shuffle([88, 14, 56])
        if not phoneNumber:
            return None
        if len(phoneNumber) != 11 or not phoneNumber.isdigit():
            return None
        return phoneNumber
