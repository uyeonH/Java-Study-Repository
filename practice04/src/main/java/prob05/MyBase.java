package prob05;

public class MyBase extends Base {
	
	public void service(String state){
		if( state.equals( "낮" ) ) {
			day();
		} else if(state.equals( "오후" )){
			afternoon();
		}
		else{
			night();
		}
	}
	private void afternoon() {
		// TODO Auto-generated method stub
		System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
		
	}
	public void day(){
		System.out.println("낮에는 열심히 일하자!");
	}
	
	public void night(){
		System.out.println("night");
	}
}
