#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r, c, t, x = 0;
  cin>>r>>c>>t;
  for(int i = 1; i <= r; i++)
  {
    if (t == 2 * i)
    {
      cout<<"It is a mango tree";
      x = 1;
      break;
    }
  }
  for(int i = 1; i <= r; i++)
  {
    if (t == (c - 1) * i && x == 0)
    {
      cout<<"It is a mango tree";
      break;
    }
    else if(i == r && x == 0)
      cout<<"It is not a mango tree";
  }
}
      