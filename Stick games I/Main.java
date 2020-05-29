#include<iostream>
using namespace std;
void print(int);
int main()
{
  //Type your code here.
  int n, m, c = 0;
  cin>>n>>m;
  while(n*m)
  {
    c++;
    n--;
    m--;
    if(n*m == 0)
      break;
  }
  print(c % 2);
  return 0;
}
void print(int a)
{
  if (a)
    cout<<"Arun Gupta";
  else
    cout<<"Mani Iyer";
}