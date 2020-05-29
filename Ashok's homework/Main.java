#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int r, c, i, j;
  cin>>r>>c;
  int m1[r][c], m2[r][c];
  for(i = 0; i < r; i++)
    for(j = 0; j < c; j++)
      cin>>m1[i][j];
  for(i = 0; i < r; i++)
    for(j = 0; j < c; j++)
      cin>>m2[i][j];
  for(i = 0; i < r; i++)
    for(j = 0; j < c; j++)
      m1[i][j] += m2[i][j];
  for(i = 0; i < r; i++)
  {
    for(j = 0; j < c; j++)
      cout<<m1[i][j]<<" ";
    cout<<"\n";
  }
  return 0;
  }