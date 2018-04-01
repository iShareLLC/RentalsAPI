import com.google.gson.Gson;
import com.wjc.model.Request;

public class Main {

	public static void main(String... args) {
		Gson gson = new Gson();
		Request request = new Request(1, "aName");
		String json = gson.toJson(request);
		System.out.println(json);
	}

}
