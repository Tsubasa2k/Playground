#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n, p = 1;
  cin>>n;
  for (int i = 1; i <= n; i++)
    p = p * i;
  cout<<p;
}