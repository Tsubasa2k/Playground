#include "iostream"
using namespace std;
int main()
{
int n, c = 11;
  cin>>n;
  for (int i = 0; i < n; i++)
  {
cout<<c*c<<" ";
    c += 4;
  }
  return 0;
}