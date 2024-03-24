public class Optimizebubblesort {

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int n = arr.length;
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        for(int x = 0; x<=n-1; x++){
            for(int j =0; j<n-1-x; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println();
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
