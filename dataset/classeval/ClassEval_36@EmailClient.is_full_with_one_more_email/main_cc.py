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

    def is_full_with_one_more_email(self, size):
        occupied_size = self.get_occupied_size()
        return True if occupied_size + size > self.capacity else False
    def get_occupied_size(self):
        occupied_size = 0
        for email in self.inbox:
            occupied_size += email["size"]
        return occupied_size