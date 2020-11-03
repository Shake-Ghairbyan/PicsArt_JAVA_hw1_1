public class Task1 {
    public static void main(String[] args) {
        int[] numArray = new int[2];
        numArray[0] = 33;
        numArray[1] = 44;
        System.out.println( "First element is of the array is " + numArray[0] + ", while the second one is "+ numArray[numArray.length - 1] +".");
        System.out.println(numArray);//it did not print array by itself, I googled, but can you explain once more?
        double[] numArray2 = {33, 44}; //only with precise knowledge what values are to be in the array
        System.out.println( numArray2[numArray.length-1] == numArray[numArray.length -1] );
    }
}
