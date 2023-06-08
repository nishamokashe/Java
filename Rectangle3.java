
//WAP to calculate the area of rectangle 
class Rectangle3
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
        Rectangle3 r = new Rectangle3();
        r.getdata(22,15);
        r.cal();
    }
}