class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) return false;
        if (s.length() != t.length())
            return false;
        Map<Character, Integer> ms = new HashMap<>();
        Map<Character, Integer> mt = new HashMap<>();
        for (char c : s.toCharArray()) {
            ms.put(c, ms.getOrDefault(c, 0) + 1);
        }
        for (char c: t.toCharArray()) {
            mt.put(c, mt.getOrDefault(c, 0) + 1);
        }
        for (Character key : ms.keySet()) {
            if (!mt.containsKey(key))
                return false;
            else if (!mt.get(key).equals(ms.get(key)))
                return false;
        }
        return true;
    }
}
