#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, se = 0, so = 0;
  cin>>n;
  int a[n];
  for (int i = 0; i <n; i++)
  {
    cin>>a[i];
    if(a[i] % 2)
      so += a[i];
    else
      se += a[i];
  }
  cout<<"The sum of the even numbers in the array is "<<se<<"\nThe sum of the odd numbers in the array is "<<so;
  return 0;
}
