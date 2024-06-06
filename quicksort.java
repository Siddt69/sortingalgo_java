public class quicksort {
    public static void print(int[] arr){

        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
    public static int partiton(int[] arr,int lo,int hi){
        int pivot = arr[lo] , pivotidx = lo;
        int smallercount=0;
        for(int i = lo+1; i<= hi; i++){
            if(arr[i]<=arr[lo]) smallercount++;
        }
        int correctidx = pivotidx+smallercount;
        swap(arr,pivotidx,correctidx);
        int i =lo,j=hi;
        while(i<correctidx && j>correctidx){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot&&arr[j]<pivot){
                swap(arr,i,j);
            }
        }
        return correctidx;

    }
    public static void qsort(int[] arr , int lo,int hi){
        if(lo>=hi) return;

        int idx = partiton(arr,lo,hi);
        partiton(arr,lo,idx-1);
        partiton(arr,idx+1,hi);
    }
    public static void main(String[] args) {
        int[] arr = {4,9,3,2,1,6,8,9,7,5};
        int n  = arr.length;
        print(arr);
        qsort(arr,0,n-1);
        System.out.println();
        print(arr);
    }
}
