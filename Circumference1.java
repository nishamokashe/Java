
//WAP to calculate the area of Circumference 
class Circumference1
{
        double pi=3.14, r=44, area;
        void cal()
        {
            area= (2*pi*r);
        }
        void display()
        {
            System.out.println("\n\n Area of Circumference is"+area);    
        }
        public static void main(String args[])
        {
            Circumference1 c = new Circumference1();
            c.cal();
            c.display();
        }
    
}
