
//WAP to calculate Percentage of Student
class One
{
    double om=433, tm=500, per;
    void calculate()
    {
        per = ((om*100)/tm);
    }
    void display()
    {
        System.out.println("\n\n Percentage of student is"+per);
    }
    public static void main (String args[])
    {
        One o = new One();
        o.calculate();
        o.display();
    }
}