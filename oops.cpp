// #include<iostream>
// using namespace std ;
// // class Cars  //c++ methods
// // {
// //     public:

// //     void myMethod()
// //     {
// //         cout<<"HONDA RS is best in 350 Segment"<<endl;
// //     }
// //     int avg ;
// //     string name;
// // };

// // class Bikes
// // {   
// //     public:
// //     Bikes()
// //     {
// //         cout<<"One day I will Buy HONDA RS";
// //     }
// //     int Speed(int maxSpeed)
// //     {
// //         return maxSpeed;
// //     }
// // };

// //Constructor With parameters

// // class Car
// // {
// //     public:
// //     string brand;
// //     string model;
// //     int avg ;
// //     Car()
// //     {
// //         brand ="Unknown";
// //         model = "Unknown";
// //     }
// //     Car(string x , string y , int z)
// //     {
// //      brand = x;
// //      model=y;
// //      avg = z;
// //     }
// // };


// // class Car// Access modifiers
// // {
// //     public:
// //     int x;
// //     private:
// //     int y;
// // };

// //Encapsulation
// // class Employee
// // {
// //     private:
// //     int salary;
    
// //     public:
// //     void  setSalary(int s)
// //     {
// //         salary =s;
// //     }
// //     int getSalary()
// //     {
// //         return salary;
// //     }

// // };

// class Employee
// {
//     private:
//     int salary;

//     public:
//     Employee(int s)
//     {
//       salary =s;
//     }
//    friend void displaySalary(Employee emp);

// };

// void displaySalary(Employee emp)
// {
//     cout<<"Salary is: "<<emp.salary;
// }
// int main()
// {
//     // Cars s;
//     // s.avg=35;
//     // s.name = "HONDA RS";
//     // cout<<s.avg<<""<<s.name<<endl;
//     // s.myMethod();

//     // Cars k ;
//     // k.avg =40;
//     // k.name ="HUNTER 350";
//     // cout<<k.avg<<""<<k.name<<endl;
//     // s.myMethod();
    
//     // Bikes l;
//     // cout<<l.Speed(100);

//     // Car a("Honda", "RS", 20);
//     // Car b("RE","Hunter 350", 25);
//     // Car c;
//     // cout<<c.brand<<c.model;
//     // cout<<a.avg<<a.brand<<a.model<<endl;
//     // cout<<b.avg<<b.brand<<b.model<<endl;

// //   Car s ;
// //   s.x=10;
// //   s.y=20;
// //   cout<<s.x<<s.y<<endl;
   

//    Employee s(5000);
//    displaySalary(s);

   

  
// }

#include<iostream>
using namespace std;

class Vehicle
{
    public:
    string brand ="HONDA RS";
    void horn()
    {
        cout<<"Dram Dram";
    }

};

class Car : public Vehicle //singlle inheritance
{
    public:
    string model ="Scorpio N";
};

class Bike: public Car//Multilevel inheritance
{
    public:
    void show()
    {
        cout<<"Hunter is best bike"<<endl;
    }
    
};

class Four: public Bike
{

};

int main()
{
   Four s ;
   s.horn();
   s.show();
   cout<<s.brand<<s.model<<endl;
}