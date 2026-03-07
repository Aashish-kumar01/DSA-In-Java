import java.util.Scanner;
public class hw4arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit: ");
        int x = sc.nextInt();

        int[] arr = {25, 34, 65, 62, 67, 86, 0, 12};
        boolean flag = true;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                flag = false;
                break;
            }
        }
        if(flag == false) System.out.print("The Number is present in the array.");
        else System.out.print("The Number is not present in the array.");


        // Another way to do this problem
        int found = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                found = i;
                break;
            }
        }

        if(found!= -1) System.out.println("Target exists in array at index "+found);
        else System.out.println("Target missing in array");

        sc.close();
    }
}
