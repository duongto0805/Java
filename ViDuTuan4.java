import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ViDuTuan4 {
    public static void main(String[] args) {
        // Copy
        Path source = Paths.get("C:\\Users\\duong\\Downloads\\Documents\\Nhom11.pdf");
        Path newdir = Paths.get("E:\\temp");
        try {
            Files.copy(source, newdir.resolve(source.getFileName()));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
