package com.example.designpattern.object.song;

public class PersonalPlayList implements Appendable, Removable {

    private PlayListData delegate;

    @Override
    public void append(Song song) {
        delegate.append(song);
    }

    @Override
    public void remove(Song song) {
        delegate.remove(song);
    }

}
