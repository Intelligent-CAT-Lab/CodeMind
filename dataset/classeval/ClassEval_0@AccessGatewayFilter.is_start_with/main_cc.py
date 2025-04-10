import logging
import datetime
class AccessGatewayFilter: 
    def __init__(self):
        pass

    def is_start_with(self, request_uri):
        start_with = ["/api", '/login']
        for s in start_with:
            if request_uri.startswith(s):
                return True
        return False