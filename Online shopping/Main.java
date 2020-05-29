#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float fa,fd,fs,sa,sd,ss,aa,ad,as;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  float  fc = (fa * (100 - fd) / 100) + fs;
  float  sc = (sa * (100 - sd) / 100) + ss; 
  float  ac = (aa * (100 - ad) / 100) + as; 
  cout<<"In Flipkart Rs."<<fc<<"\nIn Snapdeal Rs."<<sc<<"\nIn Amazon Rs."<<ac<<"\n";
  if (fc <= ac && fc <= sc)
    cout<<"He will prefer Flipkart";
  else if (sc <= ac && sc <= fc)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
}