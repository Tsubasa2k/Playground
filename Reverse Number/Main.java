#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  int n, s = 0, d;
  cin>>n;
  while(n != 0)
  {
   d = n % 10;
    s = s * 10 + d;
    n = n / 10;
  }
  cout<<s;
	return 0;
}