#include<iostream>
#include<string>
using namespace std;
int main()
{
  int n;
  string name;
  getline(cin,name);
  n=name.size();
  cout<<"The number of letters in the name is "<<n;
}