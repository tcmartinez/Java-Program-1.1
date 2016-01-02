/*
 This program uses the length fields of a 2D array
 to display the number of rows, and the number of columns ineach row.
 */


import java.util.Scanner;

public class Lengths
{
// Case 1
    public static void determineCircleArea()
    {
        Scanner input = new Scanner( System.in );
 
        System.out.print( "Enter radius of circle: " );
        double radius = input.nextDouble();
 
        System.out.printf( "Area is %f\n", circleArea( radius ) );
    }
 
    public static double circleArea( double radius )
    {
        double area = ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 2 );
        return area;
    }  
   
// Case 2
    public static void determineSphereVolume()
    {
        Scanner input = new Scanner( System.in );
 
        System.out.print( "Enter radius of sphere: " );
        double radius = input.nextDouble();
 
        System.out.printf( "Volume is %f\n", sphereVolume( radius ) );
    }
 
    public static double sphereVolume( double radius )
    {
        double volume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3 );
        return volume;
    } 
    
// Case 3
    public static void determineSquareArea()
    {
        Scanner input = new Scanner( System.in );
 
        System.out.print( "Enter length of square: " );
        double length = input.nextDouble();
 
        System.out.printf( "Volume is %f\n", squareArea( length ) );
    }
 
    public static double squareArea( double length )
    {
        double area = ( 4.0 / 3.0 ) * Math.pow( length, 2 );
        return area;
    }                       
                   
// Case 4
    public static void determineCubeVolume()
    {
        Scanner input = new Scanner( System.in );
 
        System.out.print( "Enter length of sphere: " );
        double length = input.nextDouble();
 
        System.out.printf( "Volume is %f\n", cubeVolume( length ) );
    }
 
    public static double cubeVolume( double length )
    {
        double volume = ( 4.0 / 3.0 ) * Math.pow( length, 3 );
        return volume;
    }
                   
    public static void main( String args[] )
    {
        Scanner input = new Scanner( System.in );
 
        int num;
        double radius;
        double volume;
        double length;
        double area;
 
        System.out.println("1. Circle Area");
        System.out.println("2. Sphere Volume");
        System.out.println("3. Square Area");
        System.out.println("4. Cube Volume");
        System.out.println();
        System.out.println("Enter number (or 0 to exit)");
         
        num = input.nextInt();
 
        while (num != 0)
        {
            if(num <1 || num >4)
            {
                System.out.println("Wrong input");
            }
             
            if(num >=1 && num <=4)
            {
                switch(num)
                {
     
                    case 1:
                    {
                        determineCircleArea();
                        main(null);
                    }
                    break;
    
    
                    case 2:
                    {
                        determineSphereVolume();
 
                    }
                    break;
     
                    case 3:
                    {
                        determineSquareArea();
                    }
                    break;
     
                    case 4:
                    {
                           determineCubeVolume();
                    } 


              } 
          } 
       }
    }
}
