# include "iostream"
using namespace std;
int main()
{
  int w, wm;
  cin>>wm>>w;
  if (wm > w) 
    cout<<"Yes, you can enter.";
  else if (w == wm)
    cout<<"Yes, you can enter. Kindly use a rope.";
  else
    cout<<"Sorry, you can't enter";
  return 0;
}