class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
        int indx=-1;
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                indx=i;
                break;
            }
        }
        
        if(indx==-1)
        {
            reverse(arr,0,n-1);
            return;
        }
        
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>arr[indx])
            {
                swap(arr,i,indx);
                break;
            }
        }
        
        reverse(arr,indx+1,n-1);
    }
    public void swap(int[] arr,int l,int r)
    {
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
    public void reverse(int[] arr,int l,int r)
    {
        while(l<=r)
        {
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}