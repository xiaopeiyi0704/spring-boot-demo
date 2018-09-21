package adapter;

public class AudioPlayer implements MediaPlayer {
    Adapter adapter;

    public void play(String audioType){
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: ");
        }
        else if(audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")){
            adapter = new Adapter(audioType);
            adapter.play(audioType);
        }
        else{
            System.out.println("Invalid media. "+
                    audioType + " format not supported");
        }
    }


}
