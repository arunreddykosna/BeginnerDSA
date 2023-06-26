public class BiggestOfnumbers
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int max= Math.max(z,Math.max(x,y));
        System.out.println(max);

    }
}
