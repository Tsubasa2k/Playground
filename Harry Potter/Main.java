#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i;
  cin>>i;
  int a = i / 1000;
  int b = i % 10;
  int c = (a + b) == 1 ? 1 : 2;
  cout<<c;  
}