public class Task3 {
    public static void main(String[] args) {
        int n = 0, lowerLim = -20, upperLim = 20;
        for (int i = lowerLim; i <= upperLim; i++) {/*for upper limit-(upperLim%2 == 0 ? i < upperLim: i <= upperLim) -
        will it help, or it will take more time to load?*/
            if (i % 2 != 0) {
                n++;
            }
        }

        int[] arrOfOdds = new int[n];
        int ind = 0;
        for (int i = lowerLim; i <= upperLim; i++) {
            if (i % 2 != 0) {
                arrOfOdds[ind] = i;
                ind++;
            }
        }
        System.out.println(arrOfOdds.length + " is odds' array length and should be the same as n: " + n);
        System.out.println("Last odd number of the array is " + arrOfOdds[arrOfOdds.length - 1]);
    }
}
