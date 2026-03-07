import java.util.Scanner;
public class hw2arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int x = sc.nextInt();
        System.out.print("Enter the elements of the array: ");

        int[] arr = new int[x];
        for(int i = 0; i<x; i++){
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for(int i =0; i<x; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.print(min);

        sc.close();
    }
}