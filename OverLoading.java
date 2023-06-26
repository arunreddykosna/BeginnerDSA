public class OverLoading
{
    public static void main(String [] args){
        int result1= sum (56,78,98);
        int result2 =sum (36,76);
        System.out.println(result1);
        System.out.println(result2);

    }
    static int sum (int a,int b,int c){
        return a+b+c;
    }
    static int sum (int a,int b){
        return a+b;
    }
}
