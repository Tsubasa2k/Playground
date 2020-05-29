#include "iostream"
using namespace std;
int rec (int);
int main()
{
  int n;
  cin>>n;
  cout<<rec(n);
}
int rec (int n)
{
  if (n < 10)
    return n;
    n = n % 10 + rec(n / 10);
    return rec( n );
}