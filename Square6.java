

//WAP to calculate the area of Square. 
class Square6
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
}
 class Check_Six
{    
         public static void main (String args[])
        {
            double Side =45;
            Square6 s = new Square6();   // Instance or Object Creation
            s.getdata(Side);          // Method call or Massage Passing
            s.cal();                     // Method Call or Massage Passing
        }
}

