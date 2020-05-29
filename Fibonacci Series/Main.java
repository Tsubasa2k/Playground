#include<iostream>
using namespace std;
int rec (int);
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  cout<<"The term "<<n<<" in the fibonacci series is "<<rec(n - 1);
  return 0;
}
int rec (int n)
{
  if (n == 0 || n == 1)
    return n;
  else
    return (rec(n-1) + rec(n-2));
}