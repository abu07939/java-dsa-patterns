public class pattern9 {
    public static void main(String[] args) {
        pattern9(5);
    }    static void pattern9(int n){
            for(int row=0;row<2*n;row++){

            for(int col=0;col<=2*n;col++){
                        
            int formula = Math.min(Math.min(row,col),Math.min(2*n-row,2*n-col));

                System.out.print(formula  + " ");
            }System.out.println(" ");

        }

    }
    
}
