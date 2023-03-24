public class Launcher {

  /*Java:
    Write a function that takes an integer minutes and converts it to seconds.
    Examples:
        convert(5) ➞ 300
        convert(3) ➞ 180
        convert(2) ➞ 120
    Notes: Don't forget to return the result.
   */
    public static int minute (int minute){
        int secondsCount = minute * 60;
        return secondsCount;
    }

    /*JS:
        Create a function that takes two numbers as arguments and returns their sum.
        Examples:
            addition(3, 2) ➞ 5
            addition(-3, -6) ➞ -9
            addition(7, 3) ➞ 10
        Notes: Don't forget to return the result.
    */
    public static int add(int x, int y){
        int sum = x + y;
        return sum;
    }

/*
 Create a function that returns true when x is equal to y; otherwise return false.
    isSameNum(4, 8) ➞ false
    isSameNum(2, 2) ➞  true
    isSameNum(42, 32) ➞  false
    Notes: Don't forget to return the result.
 */

    public static boolean isSameNum(int x, int y){
        if (x == y){
            return true;
        }
        return false;
    }

/*JavaScript:
    Create a function that takes a number as an argument, increments the number by +1 and returns the result.
    Examples
    addition(0) ➞ 1
    addition(9) ➞ 10
    addition(-3) ➞ -2
    Notes: Don't forget to return the result.
*/
    public static int incrementing(int x){
        return x+1;
    }

    public static void main(String[] args) {
//        System.out.println(minute(2) + "s");
//        System.out.println(add(2,3));
        System.out.println(isSameNum(4, 5));
        System.out.println(isSameNum(4, 4));
        System.out.println(isSameNum(1, 10));
        System.out.println(incrementing(0));
        System.out.println(incrementing(9));
        System.out.println(incrementing(-3));

    }
}
