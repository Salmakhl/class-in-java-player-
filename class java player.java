public class Main {
    public static void main(String[] args) {
         Player firstPlayer = new Player();
         firstPlayer .name = "Kylian Mbappé " ;
         firstPlayer .ova= 91 ;
         firstPlayer .rank = 1 ;
         firstPlayer .nationality = "France" ;
         //method to provide player information:
         firstPlayer .info() ;


         Player secondPlayer = new Player();
         secondPlayer .name = "Erling Haaland" ;
         secondPlayer .ova = 91 ;
         secondPlayer .rank = 2 ;
         secondPlayer .nationality = "Norway" ;
         //method to provide player information:
         secondPlayer .info();


         Player thirdPlayer = new Player();
         thirdPlayer .name = "Kevin De Bruyne" ;
         thirdPlayer .ova = 91 ;
         thirdPlayer .rank = 3 ;
         thirdPlayer .nationality = "Germany" ;
         //method to provide player information:
         thirdPlayer .info() ;


        Player forthPlayer = new Player();
         forthPlayer .name = "Kevin De Bruyne" ;
         forthPlayer .ova = 91 ;
         forthPlayer .rank = 3 ;
         forthPlayer .nationality = "Germany" ;
         //method to provide player information:
         forthPlayer .info() ;
    }
}


public class Player {
    String name ;

    short ova ;

    double rank ;

    String nationality;


    //method to provide player information:
    void info(){
        System.out.println ("The player name is:"+name) ;
        System.out.println ("His ova is:"+ova) ;
        System.out.println ("His rank is:"+rank) ;
        System.out.println ("And his nationality is:"+nationality) ;
    }

}