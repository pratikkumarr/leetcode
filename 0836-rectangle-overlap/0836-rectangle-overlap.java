class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1 = rec1[0], y1 = rec1[1], x2= rec1[2], y2 = rec1[3];
        int p1 = rec2[0], q1 = rec2[1], p2= rec2[2], q2 = rec2[3];
        if (x2 <= p1 || p2 <= x1 || y2 <= q1 || q2 <= y1) return false;
        return true;
    }
}