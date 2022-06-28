public  class Main{
    public static void main(String args[]){
        //System.out.println("hello world");
     
        if (args.length!=1){
            System.out.println("invalid no of arguments");
            System.exit(1);
        }
        String input = args[0];
        Playable playable = null;
        switch(input){
            case "football":
                playable = new Football();
                break;
            case "basketbal":
                playable = new Basketball();
                break;
            case "volleyball":
                playable = new Volleyball();
                break;
            case "guitar":
                playable = new Guitar();
                break;
            case "violin":
                playable = new Violin();
                break;
             case "flute":
                playable = new Flute();
                break;
            default:
                System.out.println(" invalid argument passed");
                System.exit(1);
                
        }
        play(playable);    
    }
    
    public static void play(Playable playable){
        playable.play();
        //playable.kick();
        if(playable instanceof Football){
            Football football = (Football) playable;
        football.kick();
        }
    
    }
}
