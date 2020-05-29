#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, t, s = 0, c = 0;
  cin>>n;
  while(n)
  {
cin>>t;
    s += t;
    c++;
    if (s >= n)
      break;
  }
  cout<<"The number of turns is "<<c;
}