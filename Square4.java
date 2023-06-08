

//WAP to calculate the area of Square. 
class Square4
{
        double side, area;
        void getdata(double t) //getdata() defination
        {
           side = t;
        }
        void cal()  //calculate() defination
        {
            area= (side*side);
            System.out.println("\n\n Area of square is"+area);
        }
           public static void main (String args[])
        {
            double Side=45;
            Square4 s = new Square4();   // Instance or Object Creation
            s.getdata(Side);          // Method call or Massage Passing
            s.cal();               // Method Call or Massage Passing
        }
    }
