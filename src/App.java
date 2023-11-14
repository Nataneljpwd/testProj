import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = new int[]{1,-1,34,5,3,1,2};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int index = scanner.nextInt();
        index--;// if index smaller than length of nums array And index NOT is smaller than 0
        if(index < nums.length && index >= 0)
        {
            /*
             * boolean operations:
             * 1. && (and) requriese all the booleans to be true to return true
             *  true && true -> true
             *  false && true -> false
             *  false && false -> false
             * 2. || (or) requries only one of the booleans to be true to return true
             *  true || true || false -> true
             *  false || false -> false
             *  true || false -> true
             * 3. ! (not) flips the boolean
             *  !true -> false
             *  !false -> true
             */
            System.out.println(nums[index]);
        } else if(index == 100){
            System.out.println("100 index");
        } else if(index == -100){
            System.out.println("-0100");
        } else if(true){
            // when using else if, once one condition has been satisfied, the else ifs after it wont be checked
            /*
             *  if(condition){
             *  code here
             *  }else if(condition){//if for example this condition is satisfied, the next else ifs wont be checked
             *  code here
             *  }else if(condition){
             *  code here
             *  }
             */
            System.out.println("got to last else if");
        }else{
            System.out.println("got to the else");
        }
        
        scanner.close();
    }
}
