package chap3;

import java.io.*;

/**
 * @author ddai
 * @date 2020/3/25 16:00
 */
public class Util {
    public static Reader getReader() {
        return new StringReader(getContent("/Users/daniel/github/stone-lang/src/test.txt"));
    }

    public static String getContent(String path) {
        String res = "";
        try {
            final BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/daniel/github/stone-lang/src/test.txt"));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                res += line;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }
}
