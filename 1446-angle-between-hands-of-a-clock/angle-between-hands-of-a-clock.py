class Solution(object):
    def angleClock(self, hour, minutes):
        """
        :type hour: int
        :type minutes: int
        :rtype: float
        """
        hourhand=(30*(hour%12))+(0.5*minutes)
        minutehand=6*minutes
        res=abs(hourhand-minutehand)
        return min(res,abs(360-res))