
//WAP to calculate the area of Cylender 
class Cylender1 {
    double pi = 3.14, r = 4.5, h = 2.2, area;
    void cal()
    {
        area = (2 * pi * r * h);
    }
    void display()
    {
        System.out.println("\n\n Area of Cylender is" + area);
    }
    public static void main(String[] args)
    {
        Cylender1 c = new Cylender1();
        c.cal();
        c.display();
    }
}
