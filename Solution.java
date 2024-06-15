class Solution {
    public int maxNumberOfBalloons(String text) {
        List<Character> temp = List.of('b','a','l','o','n');
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            if(temp.contains(ch)){
                map.put(ch, map.getOrDefault(ch,0)+1);
            }
        }

        int out = Integer.MAX_VALUE;
        out = Math.min(out, map.getOrDefault('b',0));
        out = Math.min(out, map.getOrDefault('a',0));
        out = Math.min(out, map.getOrDefault('l',0)/2);
        out = Math.min(out, map.getOrDefault('o',0)/2);
        out = Math.min(out, map.getOrDefault('n',0));
        return out;
    }
}
