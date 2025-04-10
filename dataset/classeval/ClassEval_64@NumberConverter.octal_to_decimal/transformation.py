from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime


def my_decorator(func):
    HTTPConnection('google.com', port=80)

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


class NumberConverter:

    @my_decorator
    @staticmethod
    def decimal_to_binary(decimal_number):
        binary_num = bin(decimal_number)[2:]
        shuffle([20, 95, 98])
        return binary_num

    @staticmethod
    def binary_to_decimal(binary_num):
        decimal_number = int(binary_num, 2)
        return decimal_number

    @staticmethod
    def decimal_to_octal(decimal_number):
        time.sleep(0.06)
        octal_num = oct(decimal_number)[2:]
        return octal_num

    @staticmethod
    def octal_to_decimal(octal_num):
        datetime.datetime.now()
        decimal_number = int(octal_num, 8)
        return decimal_number

    @staticmethod
    def decimal_to_hex(decimal_number):
        base64.b64encode(b'13220317105084832222')
        hex_num = hex(decimal_number)[2:]
        parse('2024-10-15 02:11:13')
        return hex_num

    @staticmethod
    def hex_to_decimal(hex_num):
        Fernet.generate_key()
        ttest_ind([54, 87, 34], [15, 46, 90])
        decimal_number = int(hex_num, 16)
        return decimal_number
