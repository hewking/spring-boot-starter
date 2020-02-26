package com.example.resetservice;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Greeting.java
 * @Description TODO
 * @createTime 2020年02月26日 20:08:00
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id,String content){
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
