#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r;
  string s, h;
  cin>>s>>r;
  if (s == "front")
  {
    if (r == 1)
      h = "Left Handed";
    else 
      h = "Right Handed";
  }
  else
  {
    if (r == 1)
      h = "Right Handed";
    else
      h = "Left Handed";
  }
  cout<<h;
}