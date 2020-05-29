#include<iostream>
#include "cstdlib"
using namespace std;
int main(){
  // Type your code here
  int n,m = 0, f = 0;
  cin>>n;
  int *ptr = (int *) calloc (n, sizeof(int));
  for(int i = 0; i < n; i++)
  {
    cin>>*(ptr + i);
    if (*(ptr + i) % 2)
      m++;
    else
      f++;
  }
  cout<<m<<"\n"<<f;
  return 0;
}