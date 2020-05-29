#include "iostream"
using namespace std;
int main()
{
  int n, s = 6, p ;
  cin>>n;
  for (int i = 1; i<= n; i++)
  {
    cout<<s<<" ";
    p = 5 * i;
    s += p;
  }
return 0;
}
