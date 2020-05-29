#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int b1, b2, b3, i, b;
  cin>>b1>>b2>>b3;
  for(i = b3; i > 0; i--)
    if(b1 % i == 0 && b2 % i == 0 && b3 % i == 0)
      break;
  if (b1 >= b2 && b1 <= b3)
    b = b1;
  else if (b2 >= b1 && b2 <= b3)
    b = b2;
  else if (b1 >= b3 && b1 <= b2)
    b = b2;
  else if (b2 >= b3 && b2 <= b1)
    b = b2;
  else
    b = b3;
  cout<<"The treasure is in box which has number "<<b<<"\nThe code to open the box is "<<i;
}