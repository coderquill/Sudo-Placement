//https://practice.geeksforgeeks.org/problems/minimum-shift-for-longest-common-prefix/0/?track=sp-strings

#include <bits/stdc++.h>
using namespace std;

int main() {
	int test;
	cin >> test;
	while(test--)
	{
	    string x,y;
	    cin >> x >> y;
	    
	    int i = 0;
	    int j = 0;
	    int start = -1, len = 0;
	    int ans = INT_MIN;
	    
	    while(i < x.length() && j < y.length())
	    {
	        if(y[j] == x[i]) // found a match
	        {
	            len++;
	            if (len > ans)
	            {
	                ans = len;start = j - len + 1;
	            }
	            i++;j++;
	        }
	        else if (y[j] != x[i] && len != 0) // was in continuation
	        {
	            i = 0; len = 0; j++;
	        } else 
	            j++;
	    }

        if(start == -1)
            cout << start << endl;
        else {
	        cout << start << " ";
	        for(int k = start; k <start+ans; k++)
	            cout << y[k];
	        cout << endl;
        }
	}
	return 0;
}
