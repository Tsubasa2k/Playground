#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, s = 0;
  cin>>n;
  for(int i = 1; i <= n; i++)
    s += n - i;
  cout<<s;
    
}