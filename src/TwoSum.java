
import java.util.Arrays;

public class TwoSum {
 
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;

         twoSum_Method(nums, target);
    
    }

    public static int[] twoSum_Method(int[] nums, int target) {
        
       boolean br = false;
       int[] t = new int[2];
   
        for(int i = 0; i < nums.length; i++){
             
           for(int j = 0; j < nums.length; j++) {

                 

                if (i != j && nums[i] + nums[j] == target){

                    br = true;
                    System.out.println(" nums[i] " + nums[i] + " nums[j] " + nums[j] ) ;  
                    
                    t[0] = i;
                    t[1] = j;
                    
                    break;
                
                }


           }
         
           if (br == true) {
            break;
           } 

        }

        System.out.print("----> The indexes are: ");
        
            
        System.out.print( Arrays.toString(t)  );

        

        return t; // Return null if no solution is found

    }

}
