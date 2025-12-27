public class Insertion {
    public static void main(String[] args) {
        int []a={3,7,2,6,4};
        int i,n=a.length;
        for(int j=1;j<n;j++){
        int temp=a[j];
        i=j-1;
        while(i>=0 && a[i]>temp)
            {
                a[i+1]=a[i];
                i--;
                }
            a[i+1]=temp;
        }
            for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
   }
}

    
