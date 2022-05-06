class Solution {
    public String removeDuplicates(String s, int k) {
        int count=0;
        Deque<HashMap<Character,Integer>> st=new ArrayDeque<>();
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            HashMap<Character,Integer> map=new HashMap<>();
            if(!st.isEmpty() && st.peek().containsKey(ch))
                map.put(ch,st.peek().get(ch)+1);
            else map.put(ch,1);
            st.push(map);
            if(st.peek().get(ch)==k){
                int curr=k;
                while(!st.isEmpty() && curr>0){
                    st.pop();curr--;
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            for(Map.Entry<Character,Integer> x:st.peek().entrySet()){
                sb.append(x.getKey());
            }
            st.pop();
        }
        return sb.reverse().toString();
    }
}