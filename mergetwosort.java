public class mergetwosort {
    public static void print(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void marge(int[] a , int[] b, int[] c){
        int i = 0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else{
                c[k] = b[j];
                j++;
                k++;
            }
        }
        while(i<a.length){
            c[k]=a[i];
            i++;
            k++;
        }while(j<b.length){
            c[k]=b[j];
            j++;
            k++;
        }

    }
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {4,5,6};
        print(a);
        System.out.println();
        print(b);
        System.out.println();
        int[] c = new int[a.length+b.length];
        marge(a,b,c);
        print(c);
    }
}
