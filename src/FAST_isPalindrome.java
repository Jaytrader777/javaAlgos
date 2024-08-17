public class FAST_isPalindrome {

        public boolean isPalindrome(int x) {
            
            //x = 1256776521;
            // Early exit for negative numbers and numbers ending in 0 (except 0 itself)
            if (x < 0 || (x != 0 && x % 10 == 0)) {
                return false;
            }
    
            int reversed = 0;

            int original = x;
    
            // Reverse half of the number
            while (x > reversed) {
            
                reversed = reversed * 10 + x % 10;
                x /= 10;
            
            }
    
            System.out.println(x + " ****************  r: " + reversed);

            // Check if the original number is equal to the reversed number
            return x == reversed || x == reversed / 10;
        }

        public static void main(String[] args) {
           
         FAST_isPalindrome fip = new FAST_isPalindrome();

         fip.isPalindrome(125677672);

       }

}
