#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n, mark = 0;
  cin>>n;
  int arr[n];
  for (int i = 0; i < n; i++)
  {
    cin>>arr[i];
    if (arr[i] > mark)
      mark = arr[i];
  }
  cout<<mark;
}