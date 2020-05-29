#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, s = 0, c = 0, x = 6 ;
  cin>>n;
  for (int i = 1; i <= n; i++)
  {
    cout<<s<<" ";
    if (s == 0)
      s += 2;
    else
    {
      s += x;
      c++;
      if (c == 2)
      {
        x += 4;
        c = 0;
      }
    }
  }
  return 0;  
}