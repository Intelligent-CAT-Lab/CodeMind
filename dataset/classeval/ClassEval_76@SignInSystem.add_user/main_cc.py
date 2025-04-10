
class SignInSystem: 
    def __init__(self):
        """
        Initialize the sign-in system.
        """
        self.users = {}

    def add_user(self, username):
        if username in self.users:
            return False
        else:
            self.users[username] = False
            return True