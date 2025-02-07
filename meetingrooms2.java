// TC : O(nlogn)
// SC : O(n)

class Solution {
    public int minMeetingRooms(int[][] intervals) {
       if(intervals == null || intervals.length==0) return 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        
        for(int i = 0; i<intervals.length;i++){
            if(pq.size()>0 && pq.peek()<=intervals[i][0]){
                pq.poll();
            }
            pq.add(intervals[i][1]);
        }
        return pq.size();
    }
}