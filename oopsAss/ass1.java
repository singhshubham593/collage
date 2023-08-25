import java.util.*;

// Rectangle Class File
class Rectangle {

    // Variable of data type double
    double length;
    double width;

    // Area Method to calculate the area of Rectangle
    void Area()
    {
        double area;
        area = this.length * this.width;
        System.out.println("Area of rectangle is : "
                + area);
    }

    // Perimeter Method to calculate the Perimeter of
    // Rectangle
    void Perimeter()
    {
        double perimeter;
        perimeter = 2 * (this.length + this.width);
        System.out.println("Perimeter of rectangle is : "
                + perimeter);
    }
}

class ass1 {

    public static void main(String args[])
    {
        // Object of Rectangle class is created
        Rectangle rect = new Rectangle();

        // Assigning the value in the length variable of
        // Rectangle Class
        rect.length = 15.854;

        // Assigning the value in the width variable of
        // Rectangle Class
        rect.width = 22.65;

        System.out.println("Length = " + rect.length);
        System.out.println("Width = " + rect.width);

        // Calling of Area method of Rectangle Class
        rect.Area();

        // Calling of Perimeter method of Rectangle Class
        rect.Perimeter();
    }
}
/*
Length = 15.854
Width = 22.65
Area of rectangle is : 359.09309999999994
Perimeter of rectangle is : 77.008

 */
