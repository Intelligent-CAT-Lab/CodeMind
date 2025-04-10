
class JobMarketplace: 
    def __init__(self):
        self.job_listings = []
        self.resumes = []

    def remove_job(self, job):
        self.job_listings.remove(job)