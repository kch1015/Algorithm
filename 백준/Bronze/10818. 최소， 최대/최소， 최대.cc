#include <iostream>
using namespace std;

int main()
{
    int n;
    cin >> n;
    int* arr = new int[n];
    for(int i = 0; i < n; i++)
        cin >> arr[i];
    
    int min = arr[0];
    int max = arr[0];
    for(int i = 1; i < n; i++)
    {
        if(min > arr[i])
            min = arr[i];
        if(max < arr[i])
            max = arr[i];
    }
    
    cout << min << " " << max;
    return 0;
}