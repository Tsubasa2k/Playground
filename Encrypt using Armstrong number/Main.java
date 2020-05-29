#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int t = n, r, s = 0, c = 0;
  while(t)
  {
    c ++;
    t = t/10;
  }
  t = n;
  while(t)
  {
    r = t % 10;
    s += power(r, c);
    t = t / 10;
  }
if (n == s)
  return 1;
  else
    return 0;  
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}