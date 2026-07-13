class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int hrs1 = (startTime.charAt(0) -'0') * 10 + startTime.charAt(1)-'0';
        int mins1 =( startTime.charAt(3)- '0')*10 + startTime.charAt(4)-'0';
        int sec1 = (startTime.charAt(6) - '0')*10 + startTime.charAt(7)-'0';
        int hrs2 = (endTime.charAt(0) - '0' )* 10 + endTime.charAt(1)-'0';
        int mins2 = (endTime.charAt(3) - '0')*10 + endTime.charAt(4)-'0';
        int sec2 = (endTime.charAt(6) - '0')*10 + endTime.charAt(7)-'0';

        return hrs2*3600 + mins2*60 + sec2 - (hrs1*3600 + mins1*60 + sec1);
    }
}