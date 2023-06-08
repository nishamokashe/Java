
//WAP to calculate the area of rectangle 
class Rectangle5
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
class Check_Rect
{
     public static void main(String[] args) 
    {
        Rectangle5 r = new Rectangle5();
        r.getdata(22, 15);
        r.cal();
    }
}