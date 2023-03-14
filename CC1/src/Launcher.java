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

    public static void main(String[] args) {
        System.out.println(minute(2) + "s");
        System.out.println(add(2,3));
    }
}
