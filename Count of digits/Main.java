#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int c = 0, n;
  cin>>n;
  do
  {
    n /= 10;
    c++;
  }while(n);
  cout<<c;
}