package com.example.board_api;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Getter
@Slf4j
public class Post {
    static Long staticId = 1L;
    static List<Post> posts = new ArrayList<>();
    private Long id;
    private String title;
    private String contents;

    Post(String title, String contents){
        this.id = staticId++;
        this.title = title;
        this.contents  = contents;
    }
}
