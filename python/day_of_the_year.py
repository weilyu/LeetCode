class Solution:
    def dayOfYear(self, date: str) -> int:
        y, m, d = [int(i) for i in date.split('-')]
        days_of_months = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
        day_of_year = d
        for i in range(m):
            day_of_year += days_of_months[i]
        if (y % 400 == 0 or (y % 100 != 0 and y % 4 == 0)) and m > 2:
            day_of_year += 1
        return day_of_year
        
