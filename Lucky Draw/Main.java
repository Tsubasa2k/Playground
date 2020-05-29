# include "iostream"
# include "cmath"
using namespace std;
int main()
{
int n, c = 0;
  cin>>n;
  for(int i = 1; i <= sqrt(n); i++)
  {
    int a = n / i;
    if (n % i == 0)
    {
    if (i == a)
      c -= 1;
    else
      c += 2;
  }
  }
  if (c == 2)
    cout<<"Eligible";
  else
    cout<<"Not eligible";
}
