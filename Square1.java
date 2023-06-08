
//WAP to calculate the area of square 
class Square1
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
        public static void main (String args[])
        {
            Square1 s = new Square1();
            s.cal();
            s.display();
        }
}
