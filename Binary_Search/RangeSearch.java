public class RangeSearch{
    public static void main(String args[]){
        int[] arr={5,7,7,8,8,10};
        int t=9;
        int[] sr=searchRange(arr, t);
        for(int i=0;i<sr.length;i++){
            System.out.print(sr[i]+" ");
        }
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};

        //check for the first occurrence of the target element in the array
        int start=search(nums, target, true);
        int end=search(nums, target, false);
        ans[0]=start;
        ans[1]=end;

        return ans;
        
        
        
    }

    //this function just returns the index of the target element in the array if it is present otherwise it returns -1
    static int search(int[] nums,int target,boolean findStartIndex){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                if(findStartIndex==true){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
            
        
        
    }
}

/*

*/