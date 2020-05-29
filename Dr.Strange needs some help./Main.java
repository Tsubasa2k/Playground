# include "iostream"
using namespace std;
int check (int, int);
int main()
{
  int n, m, req;
  cin>>m>>n>>req;
  if (check(m, n) >= req)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
  return 0;
}
int check (int a, int b)
{
  int t = 1;
  for(int i = 0; i < b; i++)
    t *= a;
  return t;
}
