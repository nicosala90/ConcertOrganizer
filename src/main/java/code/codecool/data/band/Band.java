package code.codecool.data.band;

import code.codecool.data.MusicStyle;

public abstract class Band {
    protected String name;
    protected MusicStyle musicStyle;

    public Band(String name, MusicStyle musicStyle) {
        this.name = name;
        this.musicStyle = musicStyle;
    }

    public MusicStyle getMusicStyle() {
        return musicStyle;
    }
}
