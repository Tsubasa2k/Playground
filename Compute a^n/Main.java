#include<iostream>
int pow (int, int);
using namespace std;
int main()
{
  //Type your code here.
  int a, n;
  cout<<"Enter the value of a";
  cin>>a;
  cout<<"\nEnter the value of n";
  cin>>n;
  cout<<"\nThe value of "<<a<<" power "<<n<<" is "<<pow(a,n);
}
int pow(int a, int n)
{
  if (n == 1)
    return a;
  else
  {
    return (a * pow(a, n - 1));
  }
}