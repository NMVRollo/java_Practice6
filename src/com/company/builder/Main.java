package com.company.builder;

public class Main {

    public static void main(String[] args) {
        Website website = new Website().builder()
                .setCms("Wordpress")
                .setName("Visit card")
                .setPrice(100)
                .build();

        System.out.println(website);
    }

}
