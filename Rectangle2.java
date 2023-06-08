
//WAP to calculate the area of rectangle 
class Rectangle2
{
    double length = 22, width = 15, area;
    void cal()
    {
        area= (length*width);
    }
    void display()
    {
        System.out.println("\n\n Area of rectangle is"+area);
    }
}
class Test1
{
     public static void main(String[] args) 
    {
        Rectangle2 r = new Rectangle2();
        r.cal();
        r.display();
    }
}