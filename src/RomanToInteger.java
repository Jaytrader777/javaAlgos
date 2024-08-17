import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        
        
        System.out.println(" Here is the number:--> " + romanToInt("MCMXCIV") );  // Output: 58
       

    }



    // understand that the values of the roman numerals will be looked at as charAt

    public static int romanToInt(String s) {
       
        // Create a map of Roman numerals to their integer values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Traverse the string from left to right
        for (int i = 0; i < s.length(); i++) {
            
            // currentValue is created and recreated in the loop
            // retrieves the value by looking at the KEY value....
            //  is a Capital letter from the s String

            int currentValue = romanMap.get(s.charAt(i) ) ;

            // If the current value is greater than the previous value, subtract twice the previous value

       
            /*
             * 
             *       currentValue: This variable holds the integer value of the current Roman numeral character in the string.
             *       prevValue:     This variable holds the integer value of the previous Roman numeral character processed by the loop.
             *       Condition (currentValue > prevValue):
             *       This checks whether the current Roman numeral's value is greater than the previous one.
             *       If this condition is true, it means you are in a situation where subtraction is required (e.g., "IV", "IX", "XL", etc.).
             *                   
             *       suppose you have "IX"  which means 9
             * 
             *       On first iteration ( ' I ')  preValue = 1 therefore 'total = 1'
             *       On the second iteration (X): currentValue = 10.
             *       
             *       Since currentValue (10) > prevValue (1), it triggers the subtraction case.      
             *       
             *       The code subtracts twice the prevValue from the  currentValue
             *       ( we have already added the first value, now we have to subtract it )
             *       and adds the result:     
             *                        
             *                                   ( 1 )              
             *                           total = total + (10 - 2 * 1)
             *                                 
             *                                 ( total )
             *                                 =   1      +  (10 - 2) 
             *                                 =   1      +      8 
             *                                 =   9 
             *     
             */


            if (currentValue > prevValue) {
                // subtraction case
                total += currentValue - 2 * prevValue;
            } else {

                // addition case
                total += currentValue;
            }

            /*
             *      
             *      After processing the current character, prevValue is updated to be the currentValue.
             *      This ensures that in the next iteration, the current value is
             *      correctly compared with the next character's value.
             * 
             */
   
            prevValue = currentValue;
        }

        return total;
    }

}