

//WAP to calculate the area of Cylender 
class Cylender3 {
    double pi, radius, height, area;
    void getdata(double p, double r, double h )
    {
        pi = p;
        radius = r;
        height = h;
    }
    void cal()
    {
        area = (2 * pi * radius * height);
        System.out.println("\n\n Area of Cylender is" + area);
    }
    public static void main(String[] args)
    {
        Cylender3 c = new Cylender3 ();
        c.getdata( 3.14,4.5, 2.2);
        c.cal();
    }
}
