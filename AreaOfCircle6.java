
//WAP to calculate area of circle
class Area6
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
class Check_Six
{   
    public static void main(String args[])
    {
        double RADIUS=2.3, PI=3.14;
        Area6 a = new Area6(); 
        a.gatdata(RADIUS, PI); 
        a.calculate();       
    }
}