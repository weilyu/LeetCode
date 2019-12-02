class Solution:
    def minTimeToVisitAllPoints(self, points: List[List[int]]) -> int:
        total_dist = 0
        for i in range(len(points) - 1):
            total_dist += self.get_dist(points[i], points[i + 1])
        return total_dist
        
    
    def get_dist(self, a, b):
        dist_x = abs(a[0] - b[0])
        dist_y = abs(a[1] - b[1])
        return dist_x + dist_y - min(dist_x, dist_y)
