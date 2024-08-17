public class IsPalindrome {


        public boolean reverseInt(int input) {
    
            // WRITE YOUR CODE HERE

              boolean same = false;
    
              String original = String.valueOf(input);
    
              String reversed = "";
    
              for(int i = 0; i < original.length(); i++){
    
                  reversed = original.charAt(i) + reversed;
    
              }

              if (original.equals(reversed) ) {
    
               same = true;
               
               return same;
              
               } else { 
                
                return same; 
            
               }
    
        }


}
