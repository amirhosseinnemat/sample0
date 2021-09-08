package com.map;


import lombok.extern.java.Log;


@Log
public class Main {


    public static void main(String[] args) {


        User user = new User();
        user.setName("amir");
        System.out.println(user);
        System.out.println("---------------------------");

        User2 user2 = new User2("ali","karimi",44);
        System.out.println(user2.getName());
        System.out.println(user2);
        log.info("user2 initialized");
        System.out.println("---------------------------");




    }


}
