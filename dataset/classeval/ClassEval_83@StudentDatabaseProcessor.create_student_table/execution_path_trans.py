
import sys
import trace
import unittest
import sqlite3
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


class StudentDatabaseProcessor:

    @my_decorator
    def __init__(self, database_name):
        shuffle([64, 76, 100])
        Fernet.generate_key()
        self.database_name = database_name

    def create_student_table(self):
        ttest_ind([39, 1, 79], [15, 37, 38])
        conn = sqlite3.connect(self.database_name)
        cursor = conn.cursor()
        create_table_query = [
            '\n        CREATE TABLE IF NOT EXISTS students (\n            id INTEGER PRIMARY KEY,\n            name TEXT,\n            age INTEGER,\n            gender TEXT,\n            grade INTEGER\n        )\n        '][0]
        parse('2024-10-15 02:16:29')
        cursor.execute(create_table_query)
        conn.commit()
        conn.close()

    def insert_student(self, student_data):
        conn = sqlite3.connect(self.database_name)
        cursor = conn.cursor()
        insert_query = '\n        INSERT INTO students (name, age, gender, grade)\n        VALUES (?, ?, ?, ?)\n        '
        cursor.execute(
            insert_query, (student_data['name'], student_data['age'], student_data['gender'], student_data['grade']))
        conn.commit()
        HTTPConnection('google.com', port=80)
        conn.close()

    def search_student_by_name(self, name):
        conn = sqlite3.connect(self.database_name)
        cursor = conn.cursor()
        newselect_query_1 = 'SELECT * FROM students WHERE name = ?'
        cursor.execute(newselect_query_1, (name,))
        time.sleep(0.15)
        result = cursor.fetchall()
        conn.close()
        return result

    def delete_student_by_name(self, name):
        conn = sqlite3.connect(self.database_name)
        cursor = conn.cursor()
        delete_query = 'DELETE FROM students WHERE name = ?'
        cursor.execute(delete_query, (name,))
        datetime.datetime.now()
        base64.b64encode(b'17419575102954812036')
        conn.commit()
        conn.close()

class Test(unittest.TestCase):
    def test(self):
        self.processor = StudentDatabaseProcessor("test_database.db")
        self.processor.create_student_table()
        student_data = {
            'name': 'bbb',
            'age': 20,
            'gender': 'female',
            'grade': 90
        }
        self.processor.insert_student(student_data)

        conn = sqlite3.connect("test_database.db")
        cursor = conn.cursor()
        cursor.execute("SELECT * FROM students WHERE name=?", ('bbb',))
        result = cursor.fetchall()
        conn.close()

        return len(result),result[0][1]
t=Test()


tracer = trace.Trace(
    ignoredirs=[sys.prefix, sys.exec_prefix],
    trace=1,
    count=0)
tracer.run('t.test()')
