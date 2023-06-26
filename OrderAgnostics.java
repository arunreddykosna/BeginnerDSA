public class OrderAgnostics
{
    public static void main(String[] args){
        int [] arr ={100,38,27,13,12,7,3,2,1,0};
        int ans=orderagnostics(arr,27);
        System.out.println(ans);

    }
    static int orderagnostics(){
        int start=0;
        int end=arr.length-1;
        boolean isAsc= arr[start]<arr[end];
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(arr[mid]>target){
                    end=mid-1;
                }else{
                    start=mid+1;
            }else{
                    if(arr[mid]<target){
                        end=mid-1;
                    }else{
                        start=mid+1;
                    }
                }
        }
        return -1;
    }
}
