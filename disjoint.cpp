#include<iostream>
#include<vector>
#include <algorithm>

using namespace std;

vector<int>parent;
vector<int>ranks;

void makeset(int vertex)
{
    parent[vertex]=vertex;
    ranks[vertex]=0;
}

int findset(int vertex)
{
    if(vertex==parent[vertex])
    return parent[vertex];
    return parent[vertex]=findset(parent[vertex]);

}

void union_set(int vert_a,int vert_b)
{
    int parent_a =findset(vert_a);
    int parent_b =findset(vert_b);

    if(parent_a!=parent_b)
    {
        if(ranks[parent_a]<ranks[parent_b])
        {
            swap(parent_a,parent_b);
        }
        parent[parent_b]=parent_a;
       if (ranks[parent_a] == ranks[parent_b])

        {
            ranks[parent_a]++;
        }
    }
}

int main()
{
    vector<int>node={1,2,3,4};
    parent=vector<int>(node.size());
    ranks=vector<int>(node.size());
    for(int i:node)
    {
        makeset(i);
    }
    int search_key=2;
    cout<<"for search key"<<search_key<<" ,the parent is "<<findset(search_key)<<" before union set\n";
    union_set(node[0],node[1]);
    cout<<"for search key"<<search_key<<" ,the parent is "<<findset(search_key)<<" before union set\n";
    search_key=3;
    cout<<"for search key"<<search_key<<" ,the parent is "<<findset(search_key)<<" before union set\n";
    union_set(node[2],node[1]);
    cout<<"for search key"<<search_key<<" ,the parent is "<<findset(search_key)<<" before union set\n";

}