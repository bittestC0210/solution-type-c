package problem02;

public class MyService extends BaseService {

	public String afternoon() {
		return "오후";
	}
	
	public void service(String state) {
		String result = state.equals("낮") ? day() : ( state.equals("밤") ? night() : afternoon()) ;
		System.out.println(result + "서비스시작");
	}
}
