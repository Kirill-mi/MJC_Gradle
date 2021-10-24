package by.kirill;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
     public static boolean isPositiveNumber(String str) {
        if (NumberUtils.isParsable(str)) {
            return Double.parseDouble(str) >= 0;
        }
        return false;
    }
}
