#include "iostream"
using namespace std;
int main()
{
int i, f, c;
  cin>>i>>f;
  for(i ; i <= f ; i++)
  {
    c = 0;
    for (int x = 1; x < i; x++)
      if (i % x == 0)
        c += x;
    if (c == i)
      cout<<i<<" ";
  }
}