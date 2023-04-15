import java.util.Arrays;

 public class Main {

    
    // 8
    public static void main(String args[])
    {

        int[] ages = {1,2,3,4,5,5,6};
        // starts at x = 1 to be able to look at the first value of the list without a out of bounds error
        for(int x = 1; x < ages.length; x++)
        {
            if(ages[x] == ages[x-1])
            {
             System.out.println("Duplicate Pair: " + ages[x] + ' ' + ages[x-1]);
            }
        }
        
        // 9
        int[] grades = {55,65,23,80,66,97,97,96};
        int count = 0;
        // starts at x = 1 to be able to look at the first value of the list without a out of bounds error
        for (int i = 1; i < grades.length; i++)
        {
            if(grades[i] == grades[i-1])
            {
             System.out.println("Duplicate detected");
            }

        }
      
    } 
    

 }




