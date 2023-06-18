package com.practice.friendConnectivity;

public class Demo {

    public static void main(String[] args) {
        FriendConnectivity friendConnectivity=new FriendConnectivity(10);
        friendConnectivity.addFriend(0,1);
        friendConnectivity.addFriend(5,1);
        friendConnectivity.addFriend(5,4);
        friendConnectivity.addFriend(6,2);
        friendConnectivity.addFriend(7,6);

        System.out.println(friendConnectivity.hasConnection(0, 4));
        System.out.println(friendConnectivity.hasConnection(0, 2));
        System.out.println(friendConnectivity.hasConnection(2,7));
    }

}
