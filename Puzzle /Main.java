#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int r, c, i, j;
  cin>>r>>c;
  int a[r][c], a1[c][r];
  for(i = 0; i < r; i++)
    for(j = 0; j < c; j++)
      cin>>a[i][j];
  for(i = 0; i < c; i++)
    for(j = 0; j < r; j++)
      a1[i][j] = a[j][i];   
    for(i = 0; i < c; i++)
    {
    for(j = 0; j < r; j++)
      cout<<a1[i][j]<<" ";
      cout<<"\n";
    }
  return 0;    
}