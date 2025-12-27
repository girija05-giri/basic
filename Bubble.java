public class Bubble {
    public static void main(String[] args) {
        int []a={3,7,2,6,4};
        int n=a.length;
        int swap=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swap++;
                }
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
            System.out.println("total swaps : "+swap);
    }
    }
    

