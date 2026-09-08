class Solution {
    public boolean isPalindrome(String s) {
         StringBuilder newStr = new StringBuilder();

        if(s=="")return true;


        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newStr.append(Character.toLowerCase(c));
            }
        }


        if(newStr.toString().equals(newStr.reverse().toString())){
            return true;
        }

        else return false;
    }
}
