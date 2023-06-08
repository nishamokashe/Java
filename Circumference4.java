
//WAP to calculate the area of Circumference 
class Circumference4
{
        double pi, radius, area;
        void getdata(double p, double r)
        {
            pi=p;
            radius=r;
        }
        void cal()
        {
            area= (2*pi*radius);
            System.out.println("\n\n Area of Circumference is"+area);    

        }
        public static void main(String args[])
        {
            double PI = 3.14, RADIUS=44;
            Circumference4 c = new Circumference4();
            c.getdata(PI, RADIUS);
            c.cal();
        }
    
}
