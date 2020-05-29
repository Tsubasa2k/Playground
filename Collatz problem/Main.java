#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, c = 0;
  cin>>n;
  while(n)
  {
    cout<<n<<"\n";
	if ( n == 1)
 	 break;
    else if (n % 2 == 0)
      n = n / 2;
    else if (n % 2 == 1)
      n = 3 * n + 1;
    c++;
  }  
  cout<<c;
}