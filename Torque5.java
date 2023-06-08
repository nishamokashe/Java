
//WAP to calculate the area of troque
class Torque5
{
        double m1, m2, area;
        void getdata(double m, double n)
        {
          m1=m;
          m2=n;
        }
        void cal()
        {        
            area =(m1+m2/m1*m2);
            System.out.println("\n\n Torque is:"+area);
        }
}
class  Check_Tor
{        
    public static void main(String args[])
     {
        Torque5 t = new Torque5();
        t.getdata(12,21);
        t.cal();
     }
}
