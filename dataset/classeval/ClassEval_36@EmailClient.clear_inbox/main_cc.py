from datetime import datetime
class EmailClient: 
    def __init__(self, addr, capacity) -> None:
        """
        Initializes the EmailClient class with the email address and the capacity of the email box.
        :param addr: The email address, str.
        :param capacity: The capacity of the email box, float.
        """
        self.addr = addr
        self.capacity = capacity
        self.inbox = []

    def clear_inbox(self, size):
        if len(self.addr) == 0:
            return
        freed_space = 0
        while freed_space < size and self.inbox:
            email = self.inbox[0]
            freed_space += email['size']
            del self.inbox[0]