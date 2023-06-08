
//WAP to calculate the area of rectangle 
class Rectangle4
{
    double length, width, area;
    void getdata(double l, double w)
    {
        length = l;
        width = w;
    }
    void cal()
    {
        area= (length*width);
        System.out.println("\n\n Area of rectangle is"+area);

    }
     public static void main(String[] args) 
    {
        double LENGTH=22, WIDTH=15;
        Rectangle4 r = new Rectangle4();
        r.getdata(LENGTH, WIDTH);
        r.cal();
    }
}