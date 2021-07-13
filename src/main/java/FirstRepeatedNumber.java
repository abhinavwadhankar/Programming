import java.lang.reflect.Array;
import java.util.TreeSet;

public class FirstRepeatedNumber {

   public void findFirstRepeatedNumber(int[] arr)
   {
       int firstRepeatedNumbers=-1;
       TreeSet treeSet =new TreeSet();
       for(int i=0;i< arr.length;i++)
       {
           if(!treeSet.add(arr[i]))
           {
               firstRepeatedNumbers=arr[i];
               break;
           }
       }
       if(firstRepeatedNumbers!=-1)
        System.out.println("First Repeated Numbers "+firstRepeatedNumbers);
       else
        System.out.println("All Numbers are Unique");

   }

}
