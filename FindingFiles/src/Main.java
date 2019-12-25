import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

import com.lynda.javatraining.filetree.FileFinder;

public class Main {

	public static void main(String[] args) throws IOException {

		Path fileDir = Paths.get("files");
		
		FileFinder visitor = new FileFinder("file*.txt");
		Files.walkFileTree(fileDir, visitor);
		
		ArrayList<Path> foundPath = visitor.foundPaths;
		
		if(foundPath.size() > 0) {
			for (Path path : foundPath) {
				System.out.println(path.toRealPath(LinkOption.NOFOLLOW_LINKS));
			}
		}else {
		System.out.println("No Files Found!");	
		}
				
		
		
	}
	
}
