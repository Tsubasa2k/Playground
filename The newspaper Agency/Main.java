#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w, x, y;
  cin>>w>>x>>y;
  int cp = w * y;
  int sp = w * x;
  int p = sp - cp - 100;
  cout<<p;
}