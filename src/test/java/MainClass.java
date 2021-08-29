import java.util.ArrayList;
import java.util.List;

public class MainClass {


    public static void main(String args[])
    {
       /* FirstRepeatedNumber firstRepeatedNumber=new FirstRepeatedNumber();
        int[] arr = new int[]{1, 3, 4, 5, 6, 7, 8};
        int[] arr1 = new int[]{1, 3, 3, 5, 5, 6, 7, 8};
        firstRepeatedNumber.findFirstRepeatedNumber(arr);
        firstRepeatedNumber.findFirstRepeatedNumber(arr1);*/

        // Should be avoided if possible

        String[] names = {
                "Alice",
                "Bob",
                "Carol",
                "David",
                "Eric",
                "Frank"

        };

        for(String name: names)
        {
            System.out.println(name);
        }

        List< Integer > numList = new ArrayList< Integer >();
        numList.add(10);
        numList.add(20);
        numList.add(30);
        numList.add(40);

        //Lambda
        numList.forEach(item -> System.out.println(item));

        //function reference
        numList.forEach(System.out::println);

    }

}
