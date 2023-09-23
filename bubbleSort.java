import java.util.Scanner;

public class bubbleSort {
    static void BSort(int[]arr){
        int n=arr.length;
        int temp=0;
        for (int i=0; i<n; i++){
            for (int step=1; step<(n-i); step++){
                if(arr[step-1]>arr[step]){
                    temp=arr[step-1];
                    arr[step-1]=arr[step];
                    arr[step]=temp;
                }
            }
        }
    }

    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the Size: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.print("Enter " +n+" Elements in Random Order: ");
        for(int i=0; i<n; i++)
           arr[i] = sc.nextInt();

        System.out.println("Array Before Sorting : ");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        BSort(arr);
        System.out.println("Array After Sorting");
         for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
