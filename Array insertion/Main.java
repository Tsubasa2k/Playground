#include<iostream>
using namespace std;
int main()
{
  int n, m;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  int a[n];
  cout<<"\nEnter the elements in the array";
  for(int i = 0; i < n; i++)
    cin>>a[i];
  cout<<"\nEnter the location where you wish to insert an element";
  cin>>m;
  if(m > n)
  {
    cout<<"\nInvalid Input";
    return 0;
  }
int e,b[n+1];
  cout<<"\nEnter the value to insert";
  cin>>e;
  b[m-1] = e;
  for (int i = 0; i <= n; i++)
  {
    if (i < m - 1)
      b[i] = a[i];
    else if (i == m -1 )
      continue;
    else
      b[i] = a[i-1];
  }
  cout<<"\nArray after insertion is\n";
  for (int i = 0; i <= n; i++)
    cout<<b[i]<<endl;
  return 0;
}