public class binary_search {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        boolean flag=false;
        int key=5;
        int l=0;
        int h= a.length-1;
        while(l<=h){
            int m=(l+h)/2;
            if(a[m]==key){
                System.out.println("found element ");
                flag=true;
                break;
        }
            if(a[m]<key){
                l=m+1;
            }
            if(a[m]>key){
                h=m-1;
            }
        }
//      if(flag==false){
//      System.out.println("element not fount  : ");
        }
    }

