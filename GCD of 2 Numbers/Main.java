#include<iostream>
using namespace std;
int rec(int, int);
int main()
{
  //Type your code here.
  int a, b;
  cin>>a>>b;
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<rec(a, b);
  return 0;   
}
int rec (int a, int b)
{
  if (b)
    return rec(b, a % b);
  else
    return a;
}