class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty())return null;
        
        StringBuilder st=new StringBuilder();

        for(String i:strs){
            st.append(i.length());
            st.append("#");
            st.append(i);
        }

        return st.toString();
    }

    public List<String> decode(String str) {

        if(str==null|| str=="") return new ArrayList<>();

        int i=0,j=0;
        List<String> ls=new ArrayList<>();

        while(i<str.length() && j<str.length()){
            j=i;
           

            while(str.charAt(j)!='#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));

            i=j+1;
            j=i+length;
            ls.add(str.substring(i,j));
            i=j;
         }

        return ls;
    }
}
