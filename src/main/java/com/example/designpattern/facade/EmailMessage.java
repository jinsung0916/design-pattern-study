package com.example.designpattern.facade;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailMessage {

    private String from;
    private String to;
    private String subject;
    private String text;

}
