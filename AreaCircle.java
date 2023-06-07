
//WAP to understand how to write first class object program
//WAP to calculate area of circle
class Area
{
    double r=2.3,PI=3.14,area;     // Data Members
    void calculate()                    //Method Dfination
    {
       area = PI*r*r;
       System.out.println("\n\n Area of Circle is"+area);
    }
    public static void main(String args[])
    {
        Area a = new Area();  //object creation
        a.calculate();        //massge passing or Method call
    }
}