#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int c, s = 0, s1 = 1, s2;
  cin>>c;
  while(c - 2)
  {
    s2 = s + s1;
    s = s1;
    s1 = s2;
    --c;
  }
  cout<<s2;
}