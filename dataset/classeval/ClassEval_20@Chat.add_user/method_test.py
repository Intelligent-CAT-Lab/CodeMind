def test(self):

        chat = Chat()
        chat.users = {'John': []}
        return chat.add_user('Mary'),chat.users