
//WAP to calculate the area of rectangle 
class Rectangle6
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
}
class Check_Six
{   
     public static void main(String[] args) 
    {
        double LENGTH=22, WIDTH=15;
        Rectangle6 r = new Rectangle6();
        r.getdata(LENGTH, WIDTH);
        r.cal();
    }
}