//WAP to calculate Percentage of Student
class Three
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
        Three o = new Three();
        o.getdata(433, 500);
        o.calculate();
    }
}