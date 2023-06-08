//WAP to calculate Percentage of Student
class Two
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
}
class Test
{    
    public static void main (String args[])
    {
        Two o = new Two();
        o.calculate();
        o.display();
    }
}