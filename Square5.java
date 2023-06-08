
//WAP to calculate the area of Square. 
class Square5 {
    double side, area;

    void getdata(double t) // getdata() defination
    {
        side = t;
    }

    void cal() // calculate() defination
    {
        area = (side * side);
        System.out.println("\n\n Area of square is" + area);
    }
}

class Check 
{
    public static void main(String args[]) {
        Square5 s = new Square5(); // Instance or Object Creation
        s.getdata(45); // Method call or Massage Passing
        s.cal(); // Method Call or Massage Passing
    }
}
