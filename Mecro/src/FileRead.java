import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileRead {
	
	private static final String COMMON_PATH = "C:\\Users\\Style2009008\\Desktop\\20230612 まとめ\\02. テストデータ\\";
	
	private static final String FILES_PATH = "SPO\\SPOSTGPManagement - クラシック（グループ外）\\本番用";
	
	public static void main(String[] args) throws Exception {

		File file = new File(COMMON_PATH + FILES_PATH);
		File[] files = file.listFiles();
		
		StringBuffer sb = new StringBuffer();
		for (File _file : files) {
			
			FileReader fr = new FileReader(_file);
			BufferedReader br = new BufferedReader(fr);
			
			String fileName = _file.getName();
			sb.append(fileName);
			sb.append("\r\n");
			while(br.ready()) {
				
				sb.append(br.readLine());
				sb.append("\r\n");
			}
			sb.append("\r\n");
		}
		
		System.out.println(sb);
	}
}
