package edu.itstep.iostreams;

import java.util.List;

public class UserProxy extends User {


    public UserProxy(int id, String name, List<Post> posts) {
        super(id, name, posts);
    }

    @Override
    public List<Post> getPosts() {
        System.out.println("SELECT FROM DB");
        return List.of(new Post("Some title", "text"));
    }
}
