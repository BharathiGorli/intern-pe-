class nonuniqueDuplicate {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,9,6,3,5,4,6,7,8,4};
        System.out.print("Non unique elements are:");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
            if (arr[i]==arr[j])
            {
                System.out.print(arr[j]+" ");
            }
        }
    }
    }
}
