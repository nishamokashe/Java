
//WAP to calculate area of circle
class Area7
{
    double radius,pi,area;     
    void gatdata()     
    {
        radius=2.3;
        pi=3.14;
    } 
    void calculate()         
    {
       area = pi*radius*radius;
    }
    void display()
    {
        System.out.println("\n\n Area of Circle is"+area);
    }
    public static void main(String args[])
    {
        Area7 a = new Area7(); 
        a.gatdata(); 
        a.calculate();    
        a.display();   
    }
}