/* Time complexity: O(n)
space complexity: O(1)
*/

class Solution{
    public String customSortStrings(String s, String T){
        StringBuilder sb =  new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<T.length(); i++){
            char c = T.charAt(i);
            map.put(c, map.getOrDefault(c,0) +1);
        }
        for(int i=0; i<S.length(); i++){
            char c = S.charAt(i);
            if(map.containsKey(c)){
                int cnt = map.get(c);
            }
            while(cnt>0){
                sb.append(c);
                cnt--;
            }
            map.remove(c);
        }
        for(char key: map.keySet()){
            int cnt = map.get(key);
            while(cnt>0){
                sb.append(key);
                cnt --;
            }
        }
        return sb.toString();
    }
}