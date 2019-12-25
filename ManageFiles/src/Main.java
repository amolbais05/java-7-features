import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Path source = Paths.get("files/loremipsum.txt");
		System.out.println(source.getFileName());
	
		Path target = Paths.get("files/newFile.txt");
		Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
	
//		Path toDelete = Paths.get("files/todelete.txt");
//		Files.delete(toDelete);
//		System.out.println("File Deleted!");
		
		Path newDir = Paths.get("files/newdir");
		Files.createDirectory(newDir);
	
		Files.move(source, newDir.resolve(source.getFileName()),
				StandardCopyOption.REPLACE_EXISTING
				);
	}

}