
//WAP to understand how to write first class object program
//WAP to calculate the area of Circumference 
class Circumference
{
        double pi=3.14, r=44, area;
        void cal()
        {
            area= (2*pi*r);
            System.out.println("\n\n Area of Circumference is"+area);    
        }
        public static void main(String args[])
        {
            Circumference c = new Circumference();
            c.cal();
        }
    
}
