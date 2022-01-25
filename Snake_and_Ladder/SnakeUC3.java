public class SnakeUC3{


	public static final int  NO_PLAY=0;
	public static final int  LADDER=1;
	public static final int  SNAKE=2;

	public static void main(String args[]){

	int position=0,dice=0,play=0;
	dice=(int)Math.floor(Math.random()*10)%6+1;
	play=(int)Math.floor(Math.random()*10)%3;
	System.out.println("player at position : "+position);
	System.out.println("dice rolled : "+dice);

	switch (play){


		case NO_PLAY:
			System.out.println("NOT SUPPOSED TO PLAY");
			break;

		case LADDER:
			System.out.println("YOU FOUND LADDER");
			break;

		default:
			System.out.println("YOU FOUND SNAKE");


	}


	}

}
