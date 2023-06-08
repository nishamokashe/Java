

//WAP to calculate the area of square 
class Square2
{
        double side=45, area;
        void cal()
        {
            area= (side*side);
        }
        void display()
        {
            System.out.println("\n\n Area of square is"+area);
        }
    }
    class Test
    {
        public static void main (String args[])
        {
            Square2 s = new Square2();
            s.cal();
            s.display();
        }
}
