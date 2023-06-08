
//WAP to calculate area of circle
class Area4
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
    public static void main(String args[])
    {
        double RADIUS=2.3, PI=3.14;
        Area4 a = new Area4(); 
        a.gatdata(RADIUS, PI); 
        a.calculate();       
    }
}