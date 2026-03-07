public class hw3arr {
    public static void main(String[] args) {
        int[] arr = {2, 4, 53, 63, 57, 27, 17};
        mul(arr);
        print(arr);

        }
        public static void mul(int[] arr){
            for(int i =0; i<arr.length; i++){
                if(i%2 == 0){
                    arr[i] *=2;
                }
                else arr[i] += 10;
            }
        }

        public static void print(int[] arr){
            for(int i = 0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        }
    
}
