public class pattern6 {
    public static void main(String[] args) {
        pattern6(5);
    }
    static void pattern6(int n){
         for(int row =0;row<n;row++){
            for(int col=0;col<n;col++){
                System.out.print(col<row? " " : "*");
            }  System.out.println(" ");    
             
        }
    }
}
