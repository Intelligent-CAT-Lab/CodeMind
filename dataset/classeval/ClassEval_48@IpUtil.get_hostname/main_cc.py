import socket
class IpUtil: 
    @staticmethod
    def get_hostname(ip_address):
        try:
            hostname = socket.gethostbyaddr(ip_address)[0]
            return hostname
        except socket.herror:
            return None