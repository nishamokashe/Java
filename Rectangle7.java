
//WAP to calculate the area of rectangle 
class Rectangle7
{
    double length, width, area;
    void getdata()
    {
        length = 22;
        width = 15;
    }
    void cal()
    {
        area= (length*width);
    }
    void display()
    {
        System.out.println("\n\n Area of rectangle is"+area);
    }
}
class Check_Seven
{  
     public static void main(String[] args) 
    {
        Rectangle7 r = new Rectangle7();
        r.getdata();
        r.cal();
        r.display();
    }
}