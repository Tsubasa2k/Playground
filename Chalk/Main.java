#include<iostream>
#include "cmath"
using namespace std;
int main()
{
  //Type your code here.
  int n, s = 0;
  cin>>n;
  float t = n;
  while(t)
  {
    s += t;
    t = (t / sqrt(n));
  }
  cout<<s;  
}