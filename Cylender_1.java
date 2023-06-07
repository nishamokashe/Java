//WAP to understand how to write first class object program
//WAP to calculate the area of Cylender 
class Cylender {
    double pi = 3.14, r = 4.5, h = 2.2, area;
    void cal()
   {
        area = (2 * pi * r * h);
        System.out.println("\n\n Area of Cylender is" + area);
    }
    public static void main(String[] args) {
        Cylender c = new Cylender();
        c.cal();
    }
}
