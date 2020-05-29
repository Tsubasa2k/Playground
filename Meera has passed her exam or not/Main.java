#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n, rn, i;
  cin>>n;
  int arr[n];
  for(i = 0; i < n; i++)
    cin>>arr[i];
  cin>>rn;
  for(i = 0; i < n; i++)
    if (rn == arr[i])
    {
      n = 0;
      break;
    }
  if(n == 0)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
  return 0;
}