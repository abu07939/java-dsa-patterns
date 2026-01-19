public class pattern7 {
    public static void main(String args[]){
        pattern7(5);
    }
    static void pattern7(int n )
{
    for(int row=0;row<=2*n;row++){
  int colinspace = row>n ? 2*n-row:row;
   int spaces = n-colinspace;
   for(int space=0;space<spaces;space++){
    System.out.print(" ");

   }for(int col=0;col<=colinspace;col++){
    System.out.print("* ");
   }System.out.println();
    }
}    
}
