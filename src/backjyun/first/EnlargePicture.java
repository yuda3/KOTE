package backjyun.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnlargePicture {
    public String[] solution(String[] picture, int k) {
        int rows = picture.length;
        int cols = picture[0].length();

        int expandedRows = rows * k;
        int expandedCols = cols * k;

        String[] expandedPicture = new String[expandedRows];

        for (int i = 0; i < rows; i++) {
            StringBuilder sb = new StringBuilder();
            String row = picture[i];

            for (int j = 0; j < cols; j++) {
                char pixel = row.charAt(j);
                sb.append(String.valueOf(pixel).repeat(Math.max(0, k)));
            }

            for (int y = 0; y < k; y++) {
                expandedPicture[i * k + y] = sb.toString();
            }
        }

        return expandedPicture;
    }

    public static void main(String[] args) {
        EnlargePicture p = new EnlargePicture();
        System.out.println(Arrays.toString(p.solution(new String[]{".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."}, 2)));

    }
}
