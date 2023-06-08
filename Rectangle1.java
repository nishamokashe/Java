
//WAP to calculate the area of rectangle 
class Rectangle1
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
     public static void main(String[] args) 
    {
        Rectangle1 r = new Rectangle1();
        r.cal();
        r.display();
    }
}