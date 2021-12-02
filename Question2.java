import java.util.ArrayList;

class Question2 {
    
    public static void removeSmallest(ArrayList<Integer> nums) {
        //This method removes the smallest number in the list nums
        int smallestIndex = 0;
        int smallestVal = nums.get(0);
        for(int i = 1; i < nums.size(); i++){
            int currVal = nums.get(i);
            if(currVal < smallestVal){
                smallestVal = currVal;
                smallestIndex = i;
            }
        }
        
        nums.remove(smallestIndex);
    }
  
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            nums.add( (int) (Math.random()*100) );
        }
        
        System.out.println("Our list before: " + nums);
        removeSmallest(nums); 
        System.out.println("Our list after:  " + nums);
    }
    
  ArrayList<String> words = new ArrayList<String>();  
}