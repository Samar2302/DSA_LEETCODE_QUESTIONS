class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->Integer.compare(b,a));
        for(int x:stones) pq.offer(x);
        while(!pq.isEmpty() && pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            if(a>b) pq.offer(a-b);
        }
        return pq.isEmpty()==true?0:pq.poll();
    }
}