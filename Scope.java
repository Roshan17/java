//Demonstrate block scope
class Scope{
    public static void main(String[] args) {
        int x ; //known to all code witin the main

        x = 10;
        if ( x == 10 ) {
            int y = 20 ; // known to all code within the scope

            // x and y both known here
            System.out.println("x and y are : "+ x + " " + y );
            x = y * 2 ;            
        }

        // y is not known here
        //y = 20 ;

        // x is known here
        System.out.println("x is : "+ x );
    }
}