public class MinofArray
{
    public static void main(String[] args){
        int [] arr ={1,2,3,4,5,6,7};
        System.out.println(minimum( arr ));
    }
    static int minimum(int[] arr){
        int ans=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[0]>arr[i]){
                ans = arr[i];
            }
        }
        return ans;
    }
}
