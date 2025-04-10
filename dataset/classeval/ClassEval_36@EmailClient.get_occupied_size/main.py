import unittest
from datetime import datetime

class EmailClient:
    def __init__(self, addr, capacity) -> None:
        self.addr = addr
        self.capacity = capacity
        self.inbox = []
    
    def send_to(self, recv, content, size):
        if not recv.is_full_with_one_more_email(size):
            timestamp = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
            email = {
                "sender": self.addr,
                "receiver": recv.addr,
                "content": content,
                "size": size,
                "time": timestamp,
                "state": "unread"
            }
            recv.inbox.append(email)
            return True
        else:
            self.clear_inbox(size)
            return False
    
    def fetch(self):
        if len(self.inbox) == 0:
            return None
        for i in range(len(self.inbox)):
            if self.inbox[i]['state'] == "unread":
                self.inbox[i]['state'] = "read"
                return self.inbox[i]
        return None

    def is_full_with_one_more_email(self, size):
        occupied_size = self.get_occupied_size()
        return True if occupied_size + size > self.capacity else False
        
    def get_occupied_size(self):
        occupied_size = 0
        for email in self.inbox:
            occupied_size += email["size"]
        return occupied_size

    def clear_inbox(self, size):
        if len(self.addr) == 0:
            return
        freed_space = 0
        while freed_space < size and self.inbox:
            email = self.inbox[0]
            freed_space += email['size']
            del self.inbox[0]
class Test(unittest.TestCase):
    def test(self):
            sender = EmailClient('sender@example.com', 100)
            receiver = EmailClient('receiver@example.com', 50)
            sender.inbox = [
                {'sender': 'sender@example.com', 'receiver': 'receiver@example.com', 'content': 'Hello', 'size': 20,
                 'time': datetime.now, 'state': 'unread'},
                {'sender': 'sender@example.com', 'receiver': 'receiver@example.com', 'content': 'Hello', 'size': 30,
                 'time': datetime.now, 'state': 'unread'}]
            return sender.get_occupied_size()