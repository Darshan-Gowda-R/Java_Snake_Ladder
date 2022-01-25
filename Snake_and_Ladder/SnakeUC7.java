public class SnakeUC3{


	public static final int  NO_PLAY=0;
	public static final int  LADDER=1;
	public static final int  SNAKE=2;

	public static void main(String args[]){

	int position=0,dice=0,play=0,player1_score=0,player2_score=0,dice_rolled=0;
	boolean chance=false;
	//System.out.println("player at position : "+position);
	//System.out.println("dice rolled : "+dice);
	while(player1_score<=100 && player2_score<=100){

	dice=(int)Math.floor(Math.random()*10)%6+1;
	play=(int)Math.floor(Math.random()*10)%3;
	dice_rolled++;
		switch (play){


			case NO_PLAY:
				chance=!chance;
				//points+=0;

				break;

			case LADDER:

				if(chance)
					player1_score+=dice;
				else
					player2_score+=dice;

				break;

			default:
				chance=!chance;
				if(chance)
					player1_score-=dice;
				else
					player2_score-=dice;

		}

		if(player1_score>100)
			player1_score-=dice;
		if(player2_score>100)
			player2_score-=dice;

		if(player1_score==100 || player2_score==100)
			break;
		//System.out.println(": "+score);
	}
	System.out.println("Player's  rolled the dice : "+dice_rolled + "   times");
	if(player1_score==100)
		System.out.println("Player1 won the game ");
	else
		System.out.println("Player2 won the game ");

	}

}
