#include <iostream>
#include <map>
#include <utility>

using namespace std;

int holecount(int value)
{
	map<int,int> kHole;
	kHole[0] =1;
	kHole[1] =0;
	kHole[2] =0;
	kHole[3] =0;
	kHole[4] =1;
	kHole[5] =0;
	kHole[6] =1;
	kHole[7] =0;
	kHole[8] =2;
	kHole[9] =1;
	int count =0;
	int temp;

	while(value>0)
	{
		temp = value%10;
		count +=kHole[temp];
		value = value/10;
	}
	

	for( map<int,int>::iterator ii=kHole.begin(); ii!=kHole.end(); ++ii)
	{
	    cout << (*ii).first << ": " << (*ii).second << endl;
	}

	return count;

}

int main()
{
	int value =842;
	cout<<"number of hole"<<holecount(value)<<endl;
	return 0;
}
