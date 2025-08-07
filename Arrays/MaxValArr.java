public class MaxValArr {
    public static void main(String[] args) {
        int[] arr = {1,99,3,56,77,2};
        System.out.println(max(arr));
        System.out.println(maxInd(arr, 2, 4));
    }

    static int max(int[] arr){
        int max=arr[0];
       for(int i=0;i<arr.length;i++){
            
            if(arr[i]>max){
                
                max=arr[i];
            }
        }
        
        return max;
        
    }

    static int maxInd(int[] arr,int start,int end){
        int max=arr[start];
       for(int i=start;i<end;i++){
            
            if(arr[i]>max){
                
                max=arr[i];
            }
        }
        
        return max;
    }
}
