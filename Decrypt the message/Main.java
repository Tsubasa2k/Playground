#include "iostream"
using namespace std;
int main()
{
  int n, t, s = 0;
  cin>>n>>t;
  n = n + t;
  t = n;
  for (int i = 1; i < n; i++)
    if (n % i == 0)
      s = s + i;
  if(t == s)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}
  