

public class Main{

    int x = 20;
    int y= 35;
    int z ;
    int modelYear ;
    String modelName;
    public void show()
    {
        System.out.println("How is your life going !");
    }

    public void speed(int maxSpeed)
    {
        System.out.println("Max speed is" +maxSpeed);
    }

    public Main(String name , int n)
    {
        z=90;
       modelYear = n;
       modelName = name;
    }
    public static void main(String[] args)
    {
        System.out.println("Jay is in barclays");
        Main s = new Main("Car" , 20);
        System.out.println(s.modelName+s.modelYear);
        String fname = "Jaywardhan";
        String lname = "Shinde";
        System.out.println(s.x);
        System.out.println(s.z);
        System.out.println(s.y);
        s.show();
        s.speed(200);
    }
}