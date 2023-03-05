package com.example.designpattern.object.song;

public class PlayList implements Appendable {

    private PlayListData delegate;

    @Override
    public void append(Song song) {
        delegate.append(song);
    }

}
