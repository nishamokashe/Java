
//WAP to understand how to write first class object program
//WAP to calculate the area of square 
class Square
{
        double side=45, area;
        void cal()
        {
            area= (side*side);
            System.out.println("\n\n Area of square is"+area);
        }
        public static void main (String args[])
        {
            Square s = new Square();
            s.cal();
        }
}
