#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, c = 3;
  float s = 0;
  while(c)
  {
    cin>>n;
    if (n < 0)
    {
      s -= 1;
      break;
    }
    if (n % 2)
    {
      s += 1;
      c--;
    }
else
  s -= 0.5;
}
  cout<<s;
}