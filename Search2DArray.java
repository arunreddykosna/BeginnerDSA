public class Search2DArray
{
    public static void main(String[] args){
        int [][] arr={
            {1,2,3},{5,3,4},{31,65,87}
        }
        System.out.Println(search(arr,31));
    }
    static int[] search(int[][] arr,int target ){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if (arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
