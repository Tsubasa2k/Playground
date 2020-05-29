#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, t, p = 1;
  cin>>n;
  t = n;
  while(t)
  {
    p *= 10;
    t = t / 10;
  }
 t = n * n;
t = t / p + t % p;
  if(t == n)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";  
}