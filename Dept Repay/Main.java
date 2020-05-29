#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x, y, r;
  cin>>x>>y>>r;
  float I, A, D, S;
  I = (x * y * r) / 100;
  A = (x) + I;
  D = 2 * I / 100;
  S = A - D;
  cout<<I<<"\n"<<A<<"\n"<<D<<"\n"<<S;
}