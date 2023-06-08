
//WAP to calculate the area of Circumference 
class Circumference5
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
class Check_Circum
{
        public static void main(String args[])
        {
            Circumference4 c = new Circumference4();
            c.getdata(3.14, 44);
            c.cal();
        }
    
}
