#include<iostream>
using namespace std;
int main()
{
  int m,n;
  cin>>m>>n;
  int mat[m][n];
  for(int i=0;i<m;i++)
    for(int j=0;j<n;j++)
      cin>>mat[i][j];
  for(int i=0;i<m;i++)
  {
    int  sum=0;
    for(int j=0;j<n;j++)
    {
      sum=sum+mat[i][j];
    }
    cout<<sum<<endl;
  }
}