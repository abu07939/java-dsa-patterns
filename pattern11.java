public class pattern11 {
    public static void main(String args[]){
        pattern11(5);
    }
    static void pattern11(int n){
        for(int row=0;row<=n;row++){
            for(int space=0;space<=n-row;space++){
                System.out.print(" ");
            }
            for(int col=0;col<=2*row;col++){
                System.out.print("*");
            }System.out.println();
        }
    }}
