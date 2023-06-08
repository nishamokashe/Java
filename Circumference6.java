
//WAP to calculate the area of Circumference 
class Circumference6
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
}
class Check_Six
{
        public static void main(String args[])
        {
            double PI = 3.14, RADIUS=44;
            Circumference4 c = new Circumference4();
            c.getdata(PI, RADIUS);
            c.cal();
        }
    
}
