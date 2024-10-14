import java.util.HashMap;
import java.util.Set;

public class IsAnagramString {

    // Time complexity: O(n)
    // Space Complexity: O(1)
    
    
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        int slength = s.length();
        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i < slength; i++){

            if(!map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i), 1);
            }
            else{
                map1.put(s.charAt(i), map1.get(s.charAt(i)) + 1);
            }

            if(!map2.containsKey(t.charAt(i))){
                map2.put(t.charAt(i), 1);
            }
            else{
                map2.put(t.charAt(i), map2.get(t.charAt(i)) + 1);
            }

        }

        if(map1.size() != map2.size()){
            return false;
        }

        Set<Character> set = map1.keySet();
        for(char c : set){
            if(map1.get(c) != map2.get(c)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("", ""));
    }
}
