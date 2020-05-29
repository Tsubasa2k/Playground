#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int s[7], a, c = 0;
for(int i = 0; i <7; i++)
  {
    cin>>s[i];
}
  for(int i = 0; i <7; i++)
  {
    c += s[i];
    if (s[i] > 8)
      s[i] = 8 * 100 + (s[i] - 8) * 115;
    else
      s[i] = s[i] * 100;
}
 s[0] = 150 * s[0] / 100;
 s[6] = 125 * s[6] / 100;

  for(int i = 0; i <7; i++)
  {
    a += s[i];
  }
  if (c > 40 && s[0] == 0 && s[6] == 0 )
    a = a + 125 * (c - 40);
  cout<<a;
}
