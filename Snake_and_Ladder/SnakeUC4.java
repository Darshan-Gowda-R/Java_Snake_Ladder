public class SnakeUC3{


	public static final int  NO_PLAY=0;
	public static final int  LADDER=1;
	public static final int  SNAKE=2;

	public static void main(String args[]){

	int position=0,dice=0,play=0,score=0;

	//System.out.println("player at position : "+position);
	//System.out.println("dice rolled : "+dice);
	while(score<=100){

	dice=(int)Math.floor(Math.random()*10)%6+1; 
	play=(int)Math.floor(Math.random()*10)%3;

		switch (play){


			case NO_PLAY:
				//points+=0;
				break;

			case LADDER:
				score=score+dice;
				break;

			default:
				score=score-dice;



		}
		System.out.println(": "+score);
	}
	System.out.println("Player reached to 100 point : "+ score);


	}

}
