
//WAP to understand how to write first class object program
//WAP to calculate the area of troque
class Torque
{
        double m1=17, m2=21, area;
        void cal()
        {        
            area =(m1+m2/m1*m2);
            System.out.println("\n\n Torque is:"+area);
        }
    public static void main(String args[])
     {
        Torque t = new Torque();
        t.cal();
     }
}
