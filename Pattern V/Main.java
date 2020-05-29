#include "iostream"
using namespace std;
int main()
{
  int n, c = 0, i, j, s = 0;
  cin>>n;
  for (i = 1; i <= n; i++)
  	for (j = 1; j<= i; j++)
  		s++;
  s = s * 2;
  for(i = 1; i <= n; i++)
  {
    for(j = 1; j <= 2 * i - 2; j++)
      cout<<"-";
    for(j = 0; j <= n - i; j++)
    {
      c++;
      cout<<c<<"*";
    }
    s = s - (n - i + 1) ;
    for(j = 1; j <= n - i + 1; j++ )
    {
    	if (j == (n - i + 1))
    		cout<<s+1;
    	else
    		cout<<s+1<<"*";
    	s++;
    }
    s = s - (n - i + 1) ;
    cout<<"\n";
}

  return 0;
}
