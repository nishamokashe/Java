
//WAP to calculate area of circle
class Area3
{
    double radius,pi,area;     
    void gatdata(double p, double r)     
    {
        radius=r;
        pi=p;
    } 
    void calculate()         
    {
       area = pi*radius*radius;
       System.out.println("\n\n Area of Circle is"+area);
    }
}
class Check_Area
{   
    public static void main(String args[])
    {
        Area3 a = new Area3(); 
        a.gatdata(2.3,3.14); 
        a.calculate();       
    }
}