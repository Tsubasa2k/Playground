#include "iostream"
using namespace std;
int main()
{
  int n, i, j;
  cin>>n;
  for(i = 1; i <= n; i++)
    for (j = 1; j <= i; j++)
    {
      if (j == i)
        cout<<i<<"\n";
      else
        cout<<i<<"*";
    }
    for(i = n; i >= 1; i--)
    for (j = 1; j <= i; j++)
    {
      if (j == i)
        cout<<i<<"\n";
      else
        cout<<i<<"*";
    }
  return 0;
}
