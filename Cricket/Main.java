#include<iostream>
# include "cmath"
double round_nplaces(double value, int to)
{
    double places = pow(10.0, to);
    return round(value * places) / places;
}
using namespace std;
int main()
{
  //Type your code here.
  int b, tr, rs, bb;
  cin>>b>>tr>>rs>>bb;
  int o = b / 6;
  float ov = bb / 6 + float((bb % 6)) / 10;
  float rr = rs / ov;
  float trr = float(tr) / o;
  cout<<o<<"\n"<<ov<<"\n"<< round_nplaces(rr, 1) << '\n'<<round_nplaces(trr, 1)<<"\n";
  if (rr > trr)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
}