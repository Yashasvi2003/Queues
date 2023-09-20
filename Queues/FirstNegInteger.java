import java.util.*;
public class FirstNegInteger{
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++) {
            int n = sc.nextInt();

            int k = sc.nextInt();

            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();

            }
            Formation(arr, k);

        }
    }
    public static int Elements(int []arr,int p,int q){
        for(int k=q;k<=p;k++){
            if(arr[k]<0){
                return arr[k];
            }
        }
        return 0;
    }
    public static void Formation(int []arr,int k) {
        for (int i = k - 1; i < arr.length; i++) {
            System.out.print(Elements(arr, i, i - k + 1) + " ");
        }
        System.out.println();
    }}
