class Linear {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6};
        int target=4;
        boolean found=false;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==target){
                found=true;
                System.out.println("element foound :"+i);
            }
        }
        if(!found){
            System.out.println(" not element foound"); 
        }
    }
    
}
