#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i;
  float t;
  cin>>i>>t;
  if(i < 3)
    cout<<float(t * 1.5 );
  else if (i == 3)
    cout<<float(t * 2 );
  else
    cout<<"Number of items is more";
}