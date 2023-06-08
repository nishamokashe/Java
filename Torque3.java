
//WAP to calculate the area of troque
class Torque3
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
    public static void main(String args[])
     {
        Torque3 t = new Torque3();
        t.getdata(12,21);
        t.cal();
     }
}
