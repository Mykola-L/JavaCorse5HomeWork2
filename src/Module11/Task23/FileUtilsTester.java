package Module11.Task23;

import java.util.HashMap;
import java.util.Map;

public class FileUtilsTester {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("мыла", "мало");
        //FileUtils.fileContentMerger(map);
        System.out.println(FileUtils.replacer(map));
        //FileUtils.fileContentReplacer(map);

        //FileUtils.checkWord("мало");
        FileUtils.checkWordWithResources("мало");
    }
}