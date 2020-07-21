package algs;

public class KnuthMorrisPrattAlg {

    public static int[] calcPrefixFunc(String str) {

        int[] prefixFunc = new int[str.length()];

        for (int strIndex = 1; strIndex < str.length(); strIndex++) {

            int j = prefixFunc[strIndex - 1];

            while (j > 0 && str.charAt(strIndex) != str.charAt(j)) {
                j = prefixFunc[j - 1];
            }

            if (str.charAt(strIndex) == str.charAt(j)) {
                j += 1;
            }

            prefixFunc[strIndex] = j;
        }

        return prefixFunc;
    }
}
