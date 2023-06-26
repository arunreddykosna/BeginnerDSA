public class Stringsearch
{
    public static void main(String[] args){
        String name = "Kosna";
        System.out.Println(search( name,"o" ));

    }
    static boolean search(String str,char target){
        for (int i=0;i<str.length;i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;

    }
}
