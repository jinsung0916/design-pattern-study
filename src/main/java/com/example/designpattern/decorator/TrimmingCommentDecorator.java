package com.example.designpattern.decorator;

public class TrimmingCommentDecorator extends CommentDecorator {

    public TrimmingCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        String trimmed = trim(comment);
        super.addComment(trimmed);
    }

    private String trim(String comment) {
        return comment.replace("...", "");
    }

}
