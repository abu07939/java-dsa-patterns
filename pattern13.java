public class pattern13 {
    public static void main(String args[]){
        pattern13(5);
    }
    static void pattern13(int n){
        for(int row=n;row>=0;row--){
            for(int space=0;space<=n-row;space++){
                System.out.print(" ");
            }
            for(int col=0;col<=2*row;col++){
                System.out.print("*");
            }System.out.println();

        }
    }
}
