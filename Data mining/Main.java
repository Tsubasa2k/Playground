#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, se = 0, so = 0;
  cin>>n;
  while(n)
  {
    int r = n % 10;
    if (r % 2)
      so += r;
    else
      se += r;
    n = n / 10;
  }
  if (se == so)
    cout<<"Yes";
  else
    cout<<"No";
}