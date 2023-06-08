
//WAP to calculate the area of Cylender 
class Cylender7 {
    double pi, radius, height, area;
    void getdata()
    {
        pi = 3.14;
        radius = 4.5;
        height = 2.2;
    }
    void calculate()
    {
        area = (2 * pi * radius * height);
    }
    void display()
    {
        System.out.println("\n\n Area of Cylender is" + area);
    }
}
class Check_Seven
{
        public static void main(String[] args)
    {
        Cylender7 c = new Cylender7();
        c.getdata();
        c.calculate();
        c.display();
    }
}
