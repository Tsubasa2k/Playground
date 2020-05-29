#include<iostream>
using namespace std;
int printresult(int*,int,int);
int main()
{
  //Type your code here.
  int n, s;
  cin>>n>>s;
  int ai[n];
  for (int i = 0; i < n; i++)
    cin>>ai[i];
  if(printresult (ai, n, s))
    cout<<"YES";
  else
    cout<<"NO";
  return 0;
}
int printresult(int* ai,int n,int s)
{
  for (int i = 0; i < n ; i++)
  {
    s -= ai[i];
  }
      if (s >= 0)
        return 1;
      else
        return 0;
}
    