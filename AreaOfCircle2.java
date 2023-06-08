
//WAP to calculate area of circle
class Area2
{
    double r=2.3,PI=3.14,area;     
    void calculate()               
    {
       area = PI*r*r;
    }
    void display()
    {
        System.out.println("\n\n Area of Circle is"+area);
    }
}
class Test
{   
    public static void main(String args[])
    {
        Area2 a = new Area2(); 
        a.calculate(); 
        a.display();       
    }
}