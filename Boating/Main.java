#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int bw, aw, cw, tw;
  cin>>bw>>aw>>cw;
  aw = aw * 75;
  cw = cw * 30;
  tw = aw + cw;
  if (tw <= bw)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}