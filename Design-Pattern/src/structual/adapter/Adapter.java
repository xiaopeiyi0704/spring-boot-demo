package adapter;

public class Adapter implements MediaPlayer {

    AdvancedMediaPlayer am;

    public Adapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            am = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            am = new Mp4Player();
        }
    }



    @Override
    public void play(String audioType) {
        if(audioType.equalsIgnoreCase("vlc")){
            am.playVlc();
        }else if(audioType.equalsIgnoreCase("mp4")){
            am.playMp4();
        }
    }


}
