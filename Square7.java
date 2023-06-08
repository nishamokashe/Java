
//WAP to calculate the area of Square. 
class Square7
{
        double side, area;
        void getdata() 
        {
           side = 45;
        }
        void cal()  //calculate() defination
        {
            area= (side*side);
        }
        void display()
        {
            System.out.println("\n\n Area of square is"+area);
        }
}
 class Check_Saven
{    
         public static void main (String args[])
        {
            Square7 s = new Square7();   // Instance or Object Creation
            s.getdata();                 // Method call or Massage Passing
            s.cal();  
            s.display();                // Method Call or Massage Passing
        }
}

