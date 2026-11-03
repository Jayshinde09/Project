#include<iostream>
using namespace std ;
// class Cars
// {
//     public:

//     void myMethod()
//     {
//         cout<<"HONDA RS is best in 350 Segment"<<endl;
//     }
//     int avg ;
//     string name;
// };

// class Bikes
// {   
//     public:
//     Bikes()
//     {
//         cout<<"One day I will Buy HONDA RS";
//     }
//     int Speed(int maxSpeed)
//     {
//         return maxSpeed;
//     }
// };

//Constructor With parameters

class Car
{
    public:
    string brand;
    string model;
    int avg ;
    Car()
    {
        brand ="Unknown";
        model = "Unknown";
    }
    Car(string x , string y , int z)
    {
     brand = x;
     model=y;
     avg = z;
    }
};

int main()
{
    // Cars s;
    // s.avg=35;
    // s.name = "HONDA RS";
    // cout<<s.avg<<""<<s.name<<endl;
    // s.myMethod();

    // Cars k ;
    // k.avg =40;
    // k.name ="HUNTER 350";
    // cout<<k.avg<<""<<k.name<<endl;
    // s.myMethod();
    
    // Bikes l;
    // cout<<l.Speed(100);

    Car a("Honda", "RS", 20);
    Car b("RE","Hunter 350", 25);
    Car c;
    cout<<c.brand<<c.model;
    cout<<a.avg<<a.brand<<a.model<<endl;
    cout<<b.avg<<b.brand<<b.model<<endl;


}