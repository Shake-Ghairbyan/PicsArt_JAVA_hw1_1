public class hw1_1 {
    public static void main(String[] args) {
        int a = 100, b = 5;
        System.out.println("The product of inputted two numbers is " + a*b);
        System.out.println("The sum of inputted two numbers is " + a*b);
        a *=  b;
        System.out.println("The new value of the first variable became "+ a );
        System.out.println("at this point our first variable is still "+ a );
        System.out.println("at this point it will be added by 1: " + ++a);
        System.out.println("at this point it will still be 501: " + a++);
        System.out.println("at this point it will 502: " + a);
        a = 500;
        System.out.println( a < 1000 || a % b == 0 && a < 10 );//true: as it moves from left to right, and 1st arg is true
        System.out.println( a < 10 && a < 1000 || a % b == 0 );/* true: since the first arg is false and with && op,
        first part is false it moves to ||'s right part which is true */
        System.out.println( !(a >= 10) && a < 1000 || a % b != 0 ); /* false: since the first arg is false,
        with && op first part is false, and the last one is false as well*/

        // if else, switch
        int age = 17;
        if (age < 20 ) {
            System.out.println("no alcohol, coca-cola");
        } else {
            System.out.println("No good story starts with a salad....");
        }

        switch (++age) {
            case 18:
                System.out.println("teenager");
                break;
            case 25:
                System.out.println("teen spirit");
                break;
            case 40:
                System.out.println("white hair, welcome!");
                break;
            default:
                System.out.println("Age is just a number");

        }
    }
}
