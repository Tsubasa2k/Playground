# include "iostream"
using namespace std;
int main() {
  int n, c = 0;
  cin>>n;
  for (int i = 1; i <= n; i++)
  {
    if (i % 2 == 1)
      for (int j = 1; j<= i; j++)
      {
        c++;
        if (i % 2)
          if (j == i)
            cout<<c<<"\n";
        else
          cout<<c<<"*";
      }
    else
    {
      c += i;
        for(int j = 1; j <= i; j++)
        {
            if (j == i)
              cout<<c<<"\n";
          else
            cout<<c<<"*";
          c--;
        }
        c += i;
    }

  }
  return 0;
}