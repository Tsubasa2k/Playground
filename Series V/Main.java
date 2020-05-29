#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, c = 11;
  cin>>n;
  for (int i = 1; i <=n ; i++)
  {
    cout<<c*c<<" ";
    c += 4;
  }
  return 0;
}