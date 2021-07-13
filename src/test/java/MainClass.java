public class MainClass {


    public static void main(String args[])
    {
        FirstRepeatedNumber firstRepeatedNumber=new FirstRepeatedNumber();
        int[] arr = new int[]{1, 3, 4, 5, 6, 7, 8};
        int[] arr1 = new int[]{1, 3, 3, 5, 5, 6, 7, 8};
        firstRepeatedNumber.findFirstRepeatedNumber(arr);
        firstRepeatedNumber.findFirstRepeatedNumber(arr1);
    }

}
