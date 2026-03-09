class Solution {
    final char DELIMETER = '#';

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String str : strs){
            sb.append(str.length());
            sb.append(DELIMETER);
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String s) {
        List<String> res = new LinkedList<>();

        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++){
            StringBuilder sb = new StringBuilder();

            while(arr[i] != DELIMETER){
                sb.append(arr[i++]);
            }
            i++;
            
            int numOfChars = Integer.valueOf(sb.toString());
            int end = i + numOfChars;
            sb = new StringBuilder();

            while(i < end){
                sb.append(arr[i++]);
            }
            i--;
            res.add(sb.toString());
        }
        return res;
    }
}
