

public class ArrayBasics {

    public static void ForEachExample(){
        int arr [] = {1,2,3,321,4,5,6,8,2,3,1,9,432};
        int sum = 0 , max = Integer.MIN_VALUE;
        for(int num : arr ){
            if(num > max){
                max = num;
            }
        }
        System.out.println(max);

    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int sum = 0, max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
            if(arr[i] > max) max = arr[i];
        }
        System.out.println("Sum : "+ sum + ", Max : "+ max);
        ForEachExample();
        
    }
}