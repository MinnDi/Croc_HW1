public class course {
     public static void main (String args[]){
         int[] v=new int[]{5,0,-1,32,4,0,77,1,-6};
         int max=v[0];
         int maxi=0;
         int min=v[0];
         int mini=0;
         for (int i=1; i<v.length;i++) {
             if (v[i]>max){
                 max=v[i];
                 maxi=i;
             }
             else if (v[i]<min){
                 min=v[i];
                 mini=i;
             }
         }
         int ch;
         if (maxi>mini) {
             for (int i = 1; i < mini; i++) {
                 ch = v[i];
                 v[i] = v[0];
                 v[0] = ch;
             }
             for (int i = maxi; i < v.length - 1; i++) {
                 ch = v[i];
                 v[i] = v[i + 1];
                 v[i + 1] = ch;
             }
             for (int i = 0; i < v.length; i++) {
                 System.out.println(v[i]);
             }
         }
         else {
             for (int i = maxi; i < v.length - 1; i++) {
                 ch = v[i];
                 v[i] = v[i + 1];
                 v[i + 1] = ch;
             }
             for (int i = 1; i < mini; i++) {
                 ch = v[i];
                 v[i] = v[0];
                 v[0] = ch;
             }
             for (int i = 0; i < v.length; i++) {
                 System.out.println(v[i]);
             }
         }
     }
}
