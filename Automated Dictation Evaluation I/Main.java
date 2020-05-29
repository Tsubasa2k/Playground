#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  int s;
  char sen[50],che[50];
  cin.getline(sen,50);
  cin.getline(che,50);
  s=strcmp(sen,che);
  if(s==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}