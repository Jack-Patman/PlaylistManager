package com.ku.jackpatman.playlist.sorts;

import com.ku.jackpatman.playlist.Track;
import java.util.Comparator;

public class TrackAlbumSort implements Comparator<Track>
{

    @Override
    public int compare(Track o1, Track o2)
    {
        String firstAlbum;
        String secondAlbum;

        if (o1.getTrackFile().hasId3v1Tag() && o2.getTrackFile().hasId3v2Tag())
        {
            firstAlbum = o1.getTrackFile().getId3v1Tag().getAlbum().toLowerCase();
            secondAlbum = o2.getTrackFile().getId3v1Tag().getAlbum().toLowerCase();
        } else
        {
            firstAlbum = o1.getTrackFile().getId3v2Tag().getAlbum().toLowerCase();
            secondAlbum = o2.getTrackFile().getId3v2Tag().getAlbum().toLowerCase();
        }

        if (firstAlbum != null && secondAlbum != null)
        {
            return (firstAlbum.compareTo(secondAlbum));

        }
        else
        {
            return 0;
        }

    }
}
