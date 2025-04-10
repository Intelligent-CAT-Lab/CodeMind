def test(self):

        server = Server()
        server.add_white_list(88)
        server.add_white_list(11)
        server.add_white_list(22)
        return server.add_white_list(22)