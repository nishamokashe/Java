
//WAP to calculate the area of troque
class Torque1
{
        double m1=17, m2=21, area;
        void cal()
        {        
            area =(m1+m2/m1*m2);
        }
        void display()
        {
            System.out.println("\n\n Torque is:"+area);
        }
    public static void main(String args[])
     {
        Torque1 t = new Torque1();
        t.cal();
        t.display();
     }
}
