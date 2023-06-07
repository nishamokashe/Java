
class Percentage
{
    float eng=66, phy=78, chem=76, math=88, comp=86;
    double obt_marks ,  total = 500, per;
    void per()
    {
        System.out.println("\n Marks of English Subject is:"+eng);
        System.out.println("\n Marks of English Subject is:"+phy);
        System.out.println("\n Marks of English Subject is:"+chem);
        System.out.println("\n Marks of English Subject is:"+math);
        System.out.println("\n Marks of English Subject is:"+comp);
        obt_marks = eng + phy + chem + math + comp;
        per = (obt_marks*100)/total;
        System.out.println("\n Total Marks is:"+obt_marks);
        System.out.println("\n Persentage of Student is:"+per);
    }
    public static void main (String args[])
    {
     Percentage p = new Percentage();
     p.per();
    }
 }
