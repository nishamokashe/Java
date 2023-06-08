


//WAP to calculate the area of Cylender 
class Cylender4 {
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
        double PI=3.14, RADIUS=4.5, HEIGHT=2.2;
        Cylender4 c = new Cylender4 ();
        c.getdata(PI, RADIUS, HEIGHT);
        c.cal();
    }
}
