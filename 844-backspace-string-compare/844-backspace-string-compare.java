class Solution {
    public boolean backspaceCompare(String s, String t) {
        Deque<Character> st=new ArrayDeque<>();
        for(char ch:s.toCharArray()){
            if(ch=='#'){
                if(!st.isEmpty()) st.poll();
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder sb1=new StringBuilder();
        while(!st.isEmpty()) sb1.append(st.poll());
        for(char ch:t.toCharArray()){
            if(ch=='#'){
                if(!st.isEmpty()) st.poll();
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder sb2=new StringBuilder();
        while(!st.isEmpty()) sb2.append(st.poll());
        return (sb1.toString()).equals(sb2.toString());
    }
}