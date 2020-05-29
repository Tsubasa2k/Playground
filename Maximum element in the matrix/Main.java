#include<iostream>
using namespace std;
int main()
{
  int m,n,max=0;
  cin>>m>>n;
  int mat[m][n];
  for(int i=0;i<m;i++)
    for(int j=0;j<n;j++)
      cin>>mat[i][j];
  for(int i=0;i<m;i++)
    for(int j=0;j<n;j++)
    {
      if(mat[i][j]>max)
        max=mat[i][j];
    }
  cout<<"The maximum element is "<<max;
}