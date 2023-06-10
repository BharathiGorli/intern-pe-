class singleDuplicate {
    public static void main(String args[])
    {
    int a[]={1,2,7,6,2,7,5,3,2};
    outer:
    for(int i=0;i<a.length;i++){
        inner:
        for(int j=i+1;j<a.length;j++){
            if(a[i]==a[j])
            {
            System.out.println("Single duplictae element in array is:" +a[j]);
            break outer;
            }
        }
    }
    }
}
