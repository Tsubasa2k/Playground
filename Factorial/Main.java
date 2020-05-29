#include<iostream>
using namespace std;
int rec (int);
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  cout<<"The factorial of "<<n<<" is "<<rec(n); 
  return 0;
}
int rec (int n)
{
  if (n == 1)
    return 1;
  else
   return n * rec(n - 1);
}