package com.example.designpattern.prototype;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        GithubIssue issue = new GithubIssue(repository);
        System.out.println(issue.getUrl());

        GithubIssue clone = (GithubIssue) issue.clone();
        System.out.println(clone.getUrl());

        System.out.println(issue != clone);
        System.out.println(issue.equals(clone));
        System.out.println(issue.getClass() == clone.getClass());
    }
}
