#include<iostream>
using namespace std;
int ret (int, int*);
int main()
{
  int n;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  int a[n];
  cout<<"\nEnter the elements in the array"<<endl;
  for(int i = 0; i < n; i++)
    cin>>a[i];
  switch(ret(n, a))
  {
    case 1:
      cout<<"The array is Even";
      break;
    case 2:
      cout<<"The array is Odd";
      break;
    case 3:
      cout<<"The array is Mixed";
      break;
  }
  return 0;
}
int ret (int n, int* a)
{
  int se = 0, so = 0;
  for(int i = 0; i < n; i++)
  {
    if (a[i] % 2)
      so += a[i];
    else
      se += a[i];
  }
  if (se > 0 && so > 0)
    return 3;
  else if(se == 0)
    return 2;
  else if (so == 0)
    return 1;
}