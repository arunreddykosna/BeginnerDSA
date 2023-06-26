import java.util.Scanner;

public class TempConverter
{
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Plz enter the temp to be Converted");
        float temp1= sc.nextFloat();
        float temp2=(temp1*9/5)+32;
        System.out.println("temp in farahnheat is": temp2);
    }
}
