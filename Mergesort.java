public class Mergesort {
        static void merge(int a[],int left,int right){
            if(left<right){
                int mid=left+(right-left)/2;
                merge(a,left,mid);
                merge(a,mid+1,right);
                me(a,left,mid,right);
            }
        }
            static void me(int a[],int left,int mid,int right){
                int n1=mid-left+1;
                int n2=right-mid;
                int []l=new int[n1];
                int []r=new int[n2];
                for (int i=0;i<n1;i++){
                    l[i]=a[left+i];
                }
                for (int j=0;j<n2;j++){
                    r[j]=a[mid+j+1];
                }
                int i=0,j=0,k=left;
                while(i<n1 &&j<n2){
                    if(l[i]<=r[j]){
                        a[k]=l[i];
                        i++;
                    }
                    else{
                        a[k]=r[j];
                        j++;
                    }
                    k++;
                }
                while(i<n1){
                    a[k]=l[i];
                        i++;
                        k++;
                }
                while(j<n2){
                    a[k]=r[j];
                        j++;
                        k++;
                }
            }
            public static void main(String[] args) {
                int[] ar={3,6,7,4,2,8};
                int n=ar.length;
                merge(ar,0,n-1);
                for(int i=0;i<n;i++){
                    System.out.print(ar[i]+" ");
                }
            }
        }
    
