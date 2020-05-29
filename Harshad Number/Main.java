#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, s = 0, t;
  cin>>n;
  t = n;
  while(t)
  {
   s += t % 10;
    t /= 10;
  }
  if (n % s == 0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
  }
