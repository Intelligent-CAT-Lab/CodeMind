def test(self):

        chat = Chat()
        chat.users = {'John': [], 'Mary': []}
        return chat.send_message('Amy', 'Amy', 'Hello'),chat.users