class Solution {

    public String encode(List<String> strs) {
        StringBuilder b = new StringBuilder();
        for(String s: strs){
            b.append(s.length());
            b.append("#");
            b.append(s);
        }
        return b.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();

        int pos = 0;
        while(pos < str.length()){
            int delimiter = str.indexOf("#", pos);
            int len = Integer.valueOf(str.substring(pos, delimiter));
            pos = delimiter + 1;
            ans.add(str.substring(pos, pos + len));
            pos = pos + len;

        }
        return ans;
    }
}

