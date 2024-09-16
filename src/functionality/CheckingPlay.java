package functionality;

public class CheckingPlay {

	Character[][] gameStatus;
	Character play;
	Character cpu;

	public CheckingPlay () {
		
	}
	
	public CheckingPlay(Character[][] gameStatus, Character play, Character cpu) {
		this.gameStatus = gameStatus;
		this.play = play;
		this.cpu = cpu;
	}

	public boolean checking(int playHorizontalCollumn, int playVerticalCollumn) {
		if (gameStatus[playHorizontalCollumn][playVerticalCollumn].equals('x')
				|| gameStatus[playHorizontalCollumn][playVerticalCollumn].equals('X')) {
			return true;
		} else if (gameStatus[playHorizontalCollumn][playVerticalCollumn].equals('o')
				|| gameStatus[playHorizontalCollumn][playVerticalCollumn].equals('O')) {
			return true;
		} else {
			return false;
		}
	}
	
	public String checkingWin() {
		// horizontal e vertical
		// 00, 01, 02
		// 10, 11, 12
		// 20, 21, 22
		
		if (gameStatus[0][0].equals(play)  && gameStatus[0][1].equals(play) && gameStatus[0][2].equals(play)) {
			return "player";
		} else if (gameStatus[1][0].equals(play)  && gameStatus[1][1].equals(play) && gameStatus[1][2].equals(play)){
			return "player";
		} else if (gameStatus[2][0].equals(play)  && gameStatus[2][1].equals(play) && gameStatus[2][2].equals(play)){
			return "player";
		}
		// vertical
		// 00 10 20
		// 01 11 21
		// 02 12 22
		else if (gameStatus[0][0].equals(play)  && gameStatus[1][0].equals(play) && gameStatus[2][0].equals(play)) {
			return "player";
		} else if (gameStatus[0][1].equals(play)  && gameStatus[1][1].equals(play) && gameStatus[2][1].equals(play)) {
			return "player";
		} else if (gameStatus[0][2].equals(play)  && gameStatus[1][2].equals(play) && gameStatus[2][2].equals(play)) {
			return "player";
		}
		// diagonal
		// 00 11 22
		// 02 11 20
		else if (gameStatus[0][0].equals(play)  && gameStatus[1][1].equals(play) && gameStatus[2][2].equals(play)) {
			return "player";
		} else if (gameStatus[0][2].equals(play)  && gameStatus[1][1].equals(play) && gameStatus[2][0].equals(play)) {
			return "player";
		}

		
		if (gameStatus[0][0].equals(cpu)  && gameStatus[0][1].equals(cpu) && gameStatus[0][2].equals(cpu)) {
			return "cpu";
		} else if (gameStatus[1][0].equals(cpu)  && gameStatus[1][1].equals(cpu) && gameStatus[1][2].equals(cpu)){
			return "cpu";
		} else if (gameStatus[2][0].equals(cpu)  && gameStatus[2][1].equals(cpu) && gameStatus[2][2].equals(cpu)){
			return "cpu";
		}
		// vertical
		// 00 10 20
		// 01 11 21
		// 02 12 22
		else if (gameStatus[0][0].equals(cpu)  && gameStatus[1][0].equals(cpu) && gameStatus[2][0].equals(cpu)) {
			return "cpu";
		} else if (gameStatus[0][1].equals(cpu)  && gameStatus[1][1].equals(cpu) && gameStatus[2][1].equals(cpu)) {
			return "cpu";
		} else if (gameStatus[0][2].equals(cpu)  && gameStatus[1][2].equals(cpu) && gameStatus[2][2].equals(cpu)) {
			return "cpu";
		}
		// diagonal
		// 00 11 22
		// 02 11 20
		else if (gameStatus[0][0].equals(cpu)  && gameStatus[1][1].equals(cpu) && gameStatus[2][2].equals(cpu)) {
			return "cpu";
		} else if (gameStatus[0][2].equals(cpu)  && gameStatus[1][1].equals(cpu) && gameStatus[2][0].equals(cpu)) {
			return "cpu";
		}
		
		
		else {
			return "null";
		}
		
		
	}

	
	
	
	
}
