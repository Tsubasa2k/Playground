#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int u, b;
  cin>>u;
  if (u <= 200)
    b = 0.5 * u;
  else if (u <= 400)
    b = 0.65 * u +100;
  else if (u <= 600)
    b = 0.80 * u + 200;
  else
    b = 1.25 * u + 425;
  cout<<"Rs."<<b;
}