
//WAP to calculate the area of square 
class Square3
{
        double side, area;
        void show(double t)  //getdata() defination
        {
           side = t;
        }
        void cal()   //calculate() defination
        {
            area = (side*side);
            System.out.println("\n\n Area of square is"+area);
        }
           public static void main (String args[])
        {
            Square3 s = new Square3();   // Instance or Object Creation
            s.show(45);          // Method call or Massage Passing
            s.cal();               // Method Call or Massage Passing
        }
    }
