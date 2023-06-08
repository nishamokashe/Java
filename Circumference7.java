
//WAP to calculate the area of Circumference 
class Circumference7
{
        double pi, radius, area;
        void getdata()
        {
            pi=3.14;
            radius=44;
        }
        void cal()
        {
            area= (2*pi*radius);
        }
        void display()
        {
            System.out.println("\n\n Area of Circumference is"+area);    
        }
}
class Check_Seven
{
        public static void main(String args[])
        {
            Circumference7 c = new Circumference7();
            c.getdata();
            c.cal();
            c.display();
        }
    
}
