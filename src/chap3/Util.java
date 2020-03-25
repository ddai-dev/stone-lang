package chap3;

import java.io.Reader;
import java.io.StringReader;

/**
 * @author ddai
 * @date 2020/3/25 16:00
 */
public class Util {
    public static Reader getReader() {
        return new StringReader("/Users/daniel/github/stone-lang/src/test.txt");
    }
}
