public class Evendigits
{
    public static void main(String [] args){
        int[] numbers = {1,35,24,162,567};
        System.out.println(findNumbers(numbers))
    }
    static int findNumbers(int[] numbers) {
        int count = 0;
        for(int num : numbers) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }
    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }


}
