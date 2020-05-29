#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mil;
  int lt, d;
  cin>>mil>>lt>>d;
  mil = mil * lt;
  if( mil >= d)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
}