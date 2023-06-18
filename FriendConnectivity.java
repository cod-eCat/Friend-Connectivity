package com.practice.friendConnectivity;

    /*
    Author @LwinPhyoAung
    addFriend -O(N)
    hasConnection -O(1)
     */

public class FriendConnectivity {

    private int[] accounts;

    public FriendConnectivity(int N){
        accounts=new int[N];
        for (int i=0; i<N; i++){
            accounts[i]=i;
        }
    }

    public void addFriend(int v, int w){
        int N = accounts.length;
        for (int i=0; i<N; i++){
            if (accounts[i]==accounts[w]){
                accounts[i]=accounts[v];
            }
        }
    }

    public boolean hasConnection(int v, int w){
        return accounts[v]==accounts[w];
    }

}
