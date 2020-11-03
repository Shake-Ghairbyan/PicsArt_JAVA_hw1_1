public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = i + 1 ;
        }
        System.out.println( "First element is of the array is " + arr[0] + ", while the last one is "+ arr[arr.length - 1] +".");
    }
}
