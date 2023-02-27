package com.example.designpattern.decorator;

public class App {

    public static void main(String[] args) {
        CommentService commentService = new SpamFilteringCommentDecorator(
                new TrimmingCommentDecorator(
                        new DefaultCommentService()
                )
        );

        Client client = new Client(commentService);

        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://www.naver.com");
    }

}
