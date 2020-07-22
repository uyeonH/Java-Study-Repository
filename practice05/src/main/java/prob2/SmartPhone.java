package prob2;

public class SmartPhone extends MusicPhone {
	@Override
	public void execute(String function) {
		if (function.equals("음악")) {
			playMusic();
			return;
		}
		if (function.equals("앱")) {
			exeApp();
			return;
		}

		super.execute(function);
	}

	private void exeApp() {
		// TODO Auto-generated method stub
		System.out.println("앱 실행");
	}

	protected void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}
}
