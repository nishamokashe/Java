//WAP to calculate Percentage of Student
class Seven
{
    double om, tm, per;
    void getdata()
    {
        om=433;
        tm=500;
    }
    void calculate()
    {
        per = ((om*100)/tm);
    }
    void display()
    {
      System.out.println("\n\n Percentage of student is"+per);
    }
}
class Test_Seven
{   
    public static void main (String args[])
    {
        Seven o = new Seven();
        o.getdata();
        o.calculate();
        o.display();
    }
}