#include<iostream>
using namespace std;
int main()
{
  int m,n,max;
  cin>>m>>n;
  int mat[m][n];
  for(int i=0;i<m;i++)
    for(int j=0;j<n;j++)
      cin>>mat[i][j];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<m;j++)
    {
      if(j==m-1)
        break;
      if(mat[j][i]>mat[j+1][i])
         max=mat[j][i];
      else
         max=mat[j+1][i];
    }
    cout<<max<<"\n";
  }
  
}