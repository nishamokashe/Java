
//WAP to calculate area of circle
class Area1
{
    double r=2.3,PI=3.14,area;     // Data Members
    void calculate()                //Method Dfination
    {
       area = PI*r*r;
    }
    void display()
    {
        System.out.println("\n\n Area of Circle is"+area);
    }
    public static void main(String args[])
    {
        Area1 a = new Area1();  //object creation
        a.calculate(); 
        a.display();       //massge passing or Method call
    }
}