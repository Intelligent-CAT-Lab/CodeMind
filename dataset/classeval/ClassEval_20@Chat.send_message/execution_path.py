
import sys
import trace
import os
import unittest
from datetime import datetime

class Chat:
    def __init__(self):
        self.users = {}

    def add_user(self, username):
        if username in self.users:
            return False
        else:
            self.users[username] = []
            return True

    def remove_user(self, username):
        if username in self.users:
            del self.users[username]
            return True
        else:
            return False

    def send_message(self, sender, receiver, message):
        if sender not in self.users or receiver not in self.users:
            return False

        timestamp = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
        message_info = {
            'sender': sender,
            'receiver': receiver,
            'message': message,
            'timestamp': timestamp
        }
        self.users[sender].append(message_info)
        self.users[receiver].append(message_info)
        return True

    def get_messages(self, username):
        if username not in self.users:
            return []
        return self.users[username]
class Test(unittest.TestCase):
    def test(self):
            chat = Chat()
            chat.users = {'John': [], 'Mary': []}
            return chat.send_message('Amy', 'Amy', 'Hello'),chat.users
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_20@Chat.send_message/output.txt', 'w') as wr:
    wr.write(str(a))
        

tracer = trace.Trace(
    ignoredirs=[sys.prefix, sys.exec_prefix],
    trace=1,
    count=0)
tracer.run('t.test()')
