import java.util.*; public class MusicPlaylistRecommendationEngine{
LinkedList<String> list=new LinkedList<>();
void play(String song){list.addFirst(song); if(list.size()>10) list.removeLast();}
boolean search(String s){return list.contains(s);} void display(){System.out.println(list);}
}