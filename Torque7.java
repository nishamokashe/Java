
//WAP to calculate the area of troque
class Torque7
{
        double m1, m2, area;
        void getdata()
        {
          m1=12;
          m2=21;
        }
        void cal()
        {        
            area =(m1+m2/m1*m2);
        }
        void display()
        {
            System.out.println("\n\n Torque is:"+area);
        }
}
class Check_Seven
{       
    public static void main(String args[])
     {
        Torque7 t = new Torque7();
        t.getdata();
        t.cal();
        t.display();
     }
}
