#include<iostream>
#include <cstring>
using namespace std;
int main()
{
  string str,str1(" ");
  getline(cin,str);
  string target=" the ";
  int found = -1;
  do{
    found=str.find(target);
    if(found!=-1)
    {
      str.replace(found,5,str1);
    }
  }while(found!=-1);
  cout<<str;
  return 0;
}