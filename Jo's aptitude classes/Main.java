#include "iostream"
using namespace std;
int check (int, int, int);
int main()
{
int a, b, c,d;
cin>>a>>b>>c>>d;
if(check(a, b, c) == d)
 cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}
int check (int a, int b, int c)
{
int small;
if (a <= b && a <= c)
  small = a;
  else if (b <= a && b <=c)
    small = b;
  else
    small = c;
  while(small)
  {
if (a % small == 0 && b % small == 0 && c % small == 0)
{
  break;
}
    small--;
  }
  return small;
}