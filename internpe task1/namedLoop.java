class namedLoop {
    public static void main(String args[]){
        outer:
        for(int i=1;i<=3;i++){
            System.out.println("Outer loop:" +i);
      
            inner:
            for(int j=1;j<=3;j++)
            {
                System.out.println("Inner loop:" +j);

                if (i==2 && j==2){
                    break outer;
                }
            }

        }
    }
}
