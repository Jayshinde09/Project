#include<iostream>
using namespace std;
#include<vector>
#include<list>
#include <string>
int main()
{
    // vector<string> cars = {"Scorpio N" , "Hunter", "BMW" ,"Mazda"};
    
    // // cout<<cars[0]<<endl;
    // // cout<<cars[1]<<endl;
    // // cout<<cars.front()<<endl;
    // // cout<<cars.back()<<endl;
    // // cout<<cars.at(1);
    // // cout<<cars.at(3);
    // // //  cout<<cars.at(4);
    // cars.push_back("Tesla");
    // cars.push_back("Honda");
    // cars.push_back("Hero");
    // for(string car:cars)
    // {
    //     cout<<car<<endl;
    // }
    // cout<<cars.size()<<endl;
    // cout<<cars.empty();
    

    //List starts from here
    list<string> bikes = {"Hunter 350", "Honda rs", "Baunvilla 4T", "RE classic"};

   

    cout<<bikes.front();
    cout<<bikes.back();

    bikes.push_back("Classic 350");
    bikes.push_back("Himalaya");
    bikes.push_back("Shinde");

     for(string bike:bikes)
    {
        cout<<bike<<endl;
    }

    bikes.pop_back();
    bikes.pop_front();

}