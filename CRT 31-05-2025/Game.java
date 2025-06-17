public class Main{
    public static void main(String[]args){
        Game =new Game("GT8","45",4.5f,"yes","","this game is full of violance","")
    }
}
public class Game{
  String title;
  String[] zoner;
  int playcount;
  float rating;
  Game(String title,String[]zoner,int playcount,float rating){
      this.title=title;
      this.playcount=palycount;
      this.rating=rating;
      this.familyFriendl=familyFriendl;
      this.playmethod=playmethod;
      this.summary=summary;
      this.zoner=zoner;
  }
   void details(){
          System.out.println("Game title:"+title);
          System.out.println("Game playcount:"+playcount):
          System.out.println("Game rating:"+rating);
          System.out.println("Game familyFriendly:"+familyFriendly);
          System.out.println("Game playmethod:"+playmethod);
          System.out.println("Game summeary:"+summary);
          System.out.println("Game zoner:");
          for(String Zoner:zoner){
                System.out.println(zoner+",");
          }
      }
    
}
