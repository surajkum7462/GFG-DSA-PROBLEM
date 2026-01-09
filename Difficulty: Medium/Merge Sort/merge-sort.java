class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r)
        {
            return;
        }
       int mid = l + (r - l) / 2;

        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    
    public void merge(int[] arr,int l,int mid,int r)
    {
        List<Integer> list = new ArrayList<>();
        int x=l;
        int y=mid+1;
        while(x<=mid && y<=r)
        {
            if(arr[x]<=arr[y])
            {
                list.add(arr[x]);
                x++;
            }
            else
            {
                list.add(arr[y]);
                y++;
            }
        }
        while(x<=mid)
        {
            list.add(arr[x]);
            x++;
        }
        while(y<=r)
        {
            list.add(arr[y]);
            y++;
        }
        for(int i=l;i<=r;i++)
        {
            arr[i]=list.get(i-l);
        }
        
        
    }
}