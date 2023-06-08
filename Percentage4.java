//WAP to calculate Percentage of Student
class Four
{
    double om, tm, per;
    void getdata(double o, double t)
    {
        om=o;
        tm=t;
    }
    void calculate()
    {
        per = ((om*100)/tm);
        System.out.println("\n\n Percentage of student is"+per);

    }
    public static void main (String args[])
    {
        double OM=433, TM=500;
        Four o = new Four();
        o.getdata(OM, TM);
        o.calculate();
    }
}