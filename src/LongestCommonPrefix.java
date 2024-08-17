public class LongestCommonPrefix {
    public static void main(String[] args) {
        
        // string of arrays to compare
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};

        // calls the longestCommonPrefix method
        System.out.println(longestCommonPrefix(strs1));  // Output: "fl"
        System.out.println(longestCommonPrefix(strs2));  // Output: ""
    
    }

    public static String longestCommonPrefix(String[] strs) {
        
        // checks length of string or if null
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start with the first string as the initial prefix
        String prefix = strs[0];

        // Compare the prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
           
            // Shorten the prefix until it matches the start of strs[i]
            while (strs[i].indexOf(prefix) != 0) {

                //System.out.println( " i :" + i ); 
                System.out.println( " strs[i].indexOf(prefix) :-> " + strs[i].indexOf(prefix) );

               
                // remember prefix was set to the value of the strs[0] - String 
                prefix = prefix.substring(0, prefix.length() - 1);

                System.out.println( "after substring --> prefix: " + prefix );
                
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}

