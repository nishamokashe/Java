
//WAP to calculate the area of troque
class Torque4
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
        double M1=12, M2=21;
        Torque4 t = new Torque4();
        t.getdata(M1,M2);
        t.cal();
     }
}
