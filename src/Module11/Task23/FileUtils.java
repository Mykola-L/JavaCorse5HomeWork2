package Module11.Task23;

        import java.io.*;
        import java.util.Map;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;
        import java.util.stream.Collectors;

public class FileUtils {
    private static final String FILENAME = "samples//sample-text.txt";

    // 11.1
    public static String replacer(Map<String, String> map) {
        String result = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            result = reader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String key : map.keySet()) {
            result = result.replace(key, map.get(key));
        }
        return result;
    }

    // 11.2. We use the above replacer instead of duplicating the code
    public static File fileContentReplacer(Map<String, String> map) {
        File file = new File(FILENAME);
        String result = replacer(map);
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    // 11.3
    public static File fileContentMerger(Map<String, String> map) {
        File file = new File(FILENAME);
        String result = replacer(map);
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.append(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    // 11.4
    public static int checkWord(String word) {
        int result = 0;
        String text = "";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(FILENAME));
            text = reader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            result++;
        }
        return result;
    }

    //11.4 part 2 - with resources
    public static int checkWordWithResources(String word) {
        int result = 0;
        String text = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))){
            text = reader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            result++;
        }
        return result;
    }
}