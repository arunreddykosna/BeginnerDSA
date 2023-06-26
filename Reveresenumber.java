public class Reveresenumber
{
    public static void main (String[] args){
        int number= 23398;
        int result =0;
        while (number>0){
            int remainder = number%10;
            number=number/10;
            result=result*10+remainder;
        }
        System.out.println(result);
    }
}
