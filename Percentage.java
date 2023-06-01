
class Percentage
{
 public static void main(String[] args)
 { 
    float eng=66, phy=78, chem=76, math=88, comp=86;
    double total, percent;

    System.out.println("\n Marks of English Subject is:"+eng);
    System.out.println("\n Marks of English Subject is:"+phy);
    System.out.println("\n Marks of English Subject is:"+chem);
    System.out.println("\n Marks of English Subject is:"+math);
    System.out.println("\n Marks of English Subject is:"+comp);

    total = eng+phy+chem+math+comp;
    percent = (total/500)*100;

    System.out.println("\n Total Marks Student is:"+total);
    System.out.println("\n Persentage of Student is:"+eng);
 }
}